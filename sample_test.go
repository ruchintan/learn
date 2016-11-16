package main

import (
	"testing"
)

func TestAppenda(t *testing.T) {
	cases := []struct {
		input  string
		answer string
	}{
		{"a", "aa"},
		{"1", "1a"},
		{"xxxxx", "xxxxxa"},
	}
	for _, c := range cases {
		if append_a(c.input) != c.answer {
			t.Errorf("expected %s - actual %s", c.answer, append_a(c.input))
		}

	}
}
