package main

import (
	"fmt"
	"strings"
	"strconv"
)

func main() {

	var input string
	var bilangan int
	fmt.Scanf("%s", &input)
	first:=strings.Split(input,":")[0]
	bilangan, _ = strconv.Atoi(first)
	if strings.HasSuffix(strings.Split(input,":")[2],"AM") == true{
		if bilangan == 12{
			fmt.Print(strings.TrimSuffix(strings.Replace(input,"12","00",1),"AM"))
		}else{
			fmt.Print(strings.TrimSuffix(input,"AM"))
		}

	}else {
		if bilangan == 12{
			fmt.Print(strings.TrimSuffix(input,"PM"))
		}else{
			newbil := 12 + bilangan
			fmt.Print(strings.TrimPrefix(strings.TrimSuffix(strings.Replace(input,strconv.Itoa(bilangan),strconv.Itoa(newbil),1),"PM"),"0"))

		}
	}
}
