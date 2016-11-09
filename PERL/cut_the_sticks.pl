#!/usr/bin/perl

use List::Util qw( min max );

$jmlh_stick = <STDIN>;
chomp($jmlh_stick);
$length_stick =<>;
chomp($length_stick);
@array_stick = split(" ",$length_stick);
$cut = min @array_stick;
#print $cut;
$pjg = @array_stick;
$nol =0;
while(@array_stick > 0)
{
	print("pjg : $pjg $array_stick[0] $cut\n ");
	
	for ($i=0;$i<@array_stick;$i++)
	{
		$array_stick[$i] = $array_stick[$i] - $cut;
	}
	print("array_before: @array_stick\n");
	@array_stick = grep { $_ > 0 } @array_stick;
	print("array: @array_stick\n");
	$cut = min @array_stick;
	$pjg = @array_stick;
}

	
