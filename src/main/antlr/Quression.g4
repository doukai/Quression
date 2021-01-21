grammar Quression;

@header {
    package io.quression.parser.antlr;
}

list: '(' items? ')';

items: item (ITEM_SEPARATOR item)*;

item: constant | attribute | function | list | quote;

function: '(' IDENTIFICATION_VARIABLE items? ')';

quote: '\'' list;

constant: STRING | NUMBER | BOOLEAN | NULL;

attribute: IDENTIFICATION_VARIABLE | IDENTIFICATION_VARIABLE ATTRIBUTE_SEPARATOR IDENTIFICATION_VARIABLE;

IDENTIFICATION_VARIABLE: ('a' .. 'z' | 'A' .. 'Z' | '_') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*;

ITEM_SEPARATOR: ' ' | ',';

ATTRIBUTE_SEPARATOR: '-' | '.';

STRING: '"' (ESC | SAFECODEPOINT)* '"';

NUMBER: '-'? INT ('.' [0-9]+)? EXP?;

BOOLEAN: TRUE | FALSE;

TRUE: '#t' | 'true';

FALSE: '#f' | 'false';

NULL: '\'()' | 'null';

fragment ESC: '\\' (["\\/bfnrt] | UNICODE);

fragment UNICODE: 'u' HEX HEX HEX HEX;

fragment HEX: [0-9a-fA-F];

fragment SAFECODEPOINT: ~ ["\\\u0000-\u001F];

fragment INT: '0' | [1-9] [0-9]*;

fragment EXP: [Ee] [+\-]? INT;

WS: [ \t\r\n] -> skip;
