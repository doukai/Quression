grammar Quression;

@header {
    package io.quression.parser.antlr;
}

expression: (block) (';' block)*;

block: filter | group | order | limit | function;

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

order: field ASC | field DESC;
group: field '#';
limit: total ':' size;

contact: AND | OR;

function: IDENTIFICATION_VARIABLE '(' (param) (',' param)* ')';

param: field | value;

value: variable | constant | function;

total: integer;

size: integer;

integer: NUMBER | variable;

variable: '$' IDENTIFICATION_VARIABLE;

constant: STRING | NUMBER | ENUM | BOOLEAN | NULL;

range: '[' value '~' value ']';

collection: '[' (item) (',' item)* ']';

item: value | range;

field:
	IDENTIFICATION_VARIABLE
	| variable
	| IDENTIFICATION_VARIABLE '.' subfield
	| variable '.' subfield;

subfield: IDENTIFICATION_VARIABLE | variable;

IDENTIFICATION_VARIABLE:
	('a' .. 'z' | 'A' .. 'Z' | '_') (
		'a' .. 'z'
		| 'A' .. 'Z'
		| '0' .. '9'
		| '_'
	)*;
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