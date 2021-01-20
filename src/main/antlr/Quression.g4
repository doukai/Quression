grammar Quression;

@header {
    package io.quression.parser.antlr;
}

collection: '(' items? ')';

items: value (',' value)*;

function: '(' functionName (',' value)* ')';

value: constant | variable | function | field | collectionValue;

collectionValue: '\'' collection;

variable: '$' IDENTIFICATION_VARIABLE;

constant: STRING | NUMBER | ENUM | BOOLEAN | NULL;

functionName: IDENTIFICATION_VARIABLE;

field:
	IDENTIFICATION_VARIABLE
	| variable
	| IDENTIFICATION_VARIABLE '.' subfield
	| variable '.' subfield;

subfield: IDENTIFICATION_VARIABLE | variable;

IDENTIFICATION_VARIABLE:
	('a' .. 'z' | 'A' .. 'Z' | '_') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*;
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