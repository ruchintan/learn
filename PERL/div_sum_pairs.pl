#!/usr/bin/perl

$line1 = <STDIN>;
chomp($line1);
@sum_div = split(" ",$line1);
$div = $sum_div[1];
$sum = $sum_div[0];
$line2 = <STDIN>;
chomp($line2);
@member = split(" ",$line2);
$count =0;

for($i=0;$i<$sum-1;$i++)
{
	for($j=$i+1;$j<$sum;$j++)
	{
		if(($member[$i]+$member[$j])%$div == 0)
		{
			$count++;
		}
	}
}
print "$count\n";
	
	 