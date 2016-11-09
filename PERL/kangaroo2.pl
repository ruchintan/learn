#!/usr/bin/perl

# This is a single line comment
use IO::Handle;

$inp = <STDIN> ;
chomp($inp); #remove newline symbol at the end
@array = split(" ",$inp); 
$flag =0;
$x1 = $array[0];
$x2= $array[2];
while($flag==0)
{
	if($x1 > $x2 and $array[1] >= $array[3])
	{
		print "NO\n";
		$flag=1;
	}
	elsif ($x1 < $x2 and $array[1] <= $array[3])
	{
		print "NO\n";
		$flag=1;
	}
	elsif ($x1 == $x2)
	{
		print "YES\n";
		$flag=1;
	}
	else
	{
		$x1 = $x1+$array[1];
		$x2 = $x2 + $array[3];
	}
}
	