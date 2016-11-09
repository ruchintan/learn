#!/usr/bin/perl

# This is a single line comment
print "Hello, world\n";
print "Hello
          world\n";
$a = 10;
print "Value of a = $a\n";
print 'Value of a = $a\n';
print "\n";

$result = "This is \"number\"";
print "$result\n";
print "\$result\n";

@ages = (25, 30, 40);             
@names = ("John Paul", "Lisa", "Kumar");
$names[0] = "mimi";
print "\$ages[0] = $ages[0]\n";
print "\$ages[1] = $ages[1]\n";
print "\$ages[2] = $ages[2]\n";
print "\$names[0] = $names[0]\n";
print "\$names[1] = $names[1]\n";
print "\$names[2] = $names[2]\n";

%data = ('john',45, 'Lisa', 30, 'Kumar', 40);
print "\$data{'John Paul'} = $data{'john'}\n";
print "\$data{'Lisa'} = $data{'Lisa'}\n";
print "\$data{'Kumar'} = $data{'Kumar'}\n";

@names = ('John Paul', 'Lisa', 'Kumar');
@copy = @names;
$size = @copy;
print "Given names are : @copy\n";
print "Number of names are : $size\n";

print "File name ". __FILE__ . "\n";
print "Line Number " . __LINE__ ."\n";
print "Package " . __PACKAGE__ ."\n";

# they can not be interpolated
print "__FILE__ __LINE__ __PACKAGE__\n";


=begin comment
This is all part of multiline comment.
You can use as many lines as you like
These comments will be ignored by the 
compiler until the next =cut is encountered.
=cut