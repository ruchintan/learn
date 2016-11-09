package main

import (
	"fmt"
	"strings"
	"sort"
)

func main() {

	var testcase int
	var word string
	var array [] string
	fmt.Scanln(&testcase)
	for i := 0; i < testcase; i++ {
		fmt.Scanf("%s", &word)
		array = strings.Split(word, "")
		temp_str := word
		sort.Strings(array)
		desc := make([]string, len(array))
		i:=0
		for k := len(array) - 1; k >= 0; k-- {
			desc[i] = array[k]
			i++
		}
		fmt.Print(desc)
		flag := 0
		index := 0
		for k := len(array) - 1; k > 0; k-- {
			for j := k - 1; j >= 0; j-- {
				if (array[k] > array[j]) {
					temp := array[j]
					array[j] = array[k]
					array[k] = temp
					w_str := strings.Join(array, "")
					if (strings.Compare(w_str, temp_str) == -1) {
						temp1 := array[j]
						array[j] = array[k]
						array[k] = temp1
					} else {
						flag = 1
						index = j
						break
					}
				}
			}
			if flag == 1 {
				break
			}
		}
		for m := index + 1; m < len(array); m++ {
			for n := m + 1; n < len(array); n++ {
				if (array[m] > array[n]) {
					temp3 := array[m]
					array[m] = array[n]
					array[n] = temp3
					w_str := strings.Join(array, "")
					if (strings.Compare(w_str, temp_str) == -1) {
						temp4 := array[m]
						array[m] = array[n]
						array[n] = temp4
					}
				}
			}
		}
		s_final:=strings.Join(array, "")
		if s_final==temp_str {
			fmt.Println("no answer")
		}else{
			fmt.Println(s_final)
		}
	}
}
