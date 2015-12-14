# GPS

A simple and generic routing library for Clojure. Regex-like input matching on
arbitrary sequences, and helpers to create routes for HTTP requests.

## Usage

TODO

## Design Notes

Builds regular expression FSMs (real regular expressions, not text-munging Perl
regular expressions) from route definitions on arbitrary input sequences (strings,
vectors, whatever).

Route definitions are Enlive-like vectors of predicates on input sequence elements.

`gps.http` contains predicates and helper methods for working with Ring HTTP
requests.

Doesn't care what the return value is; could be a Ring response, or anything
else.

Route predicates can also act as "collectors", reducing/folding the input
sequence rather than just returning a boolean. This can be used to parse path
components from a URL, for example.