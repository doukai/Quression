grammar Quression;

@header {
    package io.quression.parser.antlr;
}

expression: (block) (';' block)*;

block: filter | order | function;

filter: condition (contact condition)*;

condition: uni | multi;

multi: '(' uni (contact uni)* ')';

uni:
	eq
	| neq
	| gt
	| ge
	| lt
	| le
	| lk
	| sl
	| el
	| nlk
	| nsl
	| nel
	| in
	| nin
	| isn
	| nn;

eq: field '=' value;
neq: field '!=' value;
gt: field '>' value;
ge: field '>=' value;
lt: field '<' value;
le: field '<=' value;
lk: field '%' value;
sl: field '%^' value;
el: field '^%' value;
nlk: field '!%' value;
nsl: field '!%^' value;
nel: field '!^%' value;
in: field '@' collection;
nin: field '!@' collection;
isn: field '^';
nn: field '!^';

order: field sort (',' field sort)*;

contact: AND | OR;
sort: ASC | DESC;

value: variable | constant | function | type;

variable: '$' IDENTIFICATION_VARIABLE;

param: field | value;

function: IDENTIFICATION_VARIABLE '(' (param) (',' param)* ')';

type: '@' IDENTIFICATION_VARIABLE '(' (constant) (',' constant)* ')';

constant: STRING | NUMBER | ENUM | BOOLEAN | NULL;

range: '[' min '~' max ']';

min: value ( '!' );

max: value ( '!' );

collection: '[' (item) (',' item)* ']';

item: value | range;

field:
	IDENTIFICATION_VARIABLE
	| variable
	| IDENTIFICATION_VARIABLE '.' subfield
	| variable '.' subfield;

subfield: IDENTIFICATION_VARIABLE | variable;

IDENTIFICATION_VARIABLE:
	('a' .. 'z' | 'A' .. 'Z' | '_') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*;
AND: '&';
OR: '|';

ASC: '+';
DESC: '-';

STRING: '"' (ESC | SAFECODEPOINT)* '"';
NUMBER: '-'? INT ('.' [0-9]+)? EXP?;
ENUM: IDENTIFICATION_VARIABLE '.' IDENTIFICATION_VARIABLE;
BOOLEAN: 'true' | 'false';
NULL: 'null';

fragment ESC: '\\' (["\\/bfnrt] | UNICODE);

fragment UNICODE: 'u' HEX HEX HEX HEX;

fragment HEX: [0-9a-fA-F];

fragment SAFECODEPOINT: ~ ["\\\u0000-\u001F];

fragment INT: '0' | [1-9] [0-9]*;

fragment EXP: [Ee] [+\-]? INT;

WS: [ \t\r\n] -> skip;