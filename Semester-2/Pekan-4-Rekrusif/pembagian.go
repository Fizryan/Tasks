package main

import (
	"fmt"
)

func bagi(m, n int) int {
	/*{ I.S. Terdefinisi sebuah bilangan bulat positif m dan n.
	  F.S. Fungsi mengembalikan hasil m div n. }*/
	if m < n { // gunakan operator yang tepat
		return 0
	} else {
		return 1 + bagi(m-n, n)
	}
}

func main() {
	var m, n int
	fmt.Scan(&m, &n)
	fmt.Println(bagi(m, n))
}
