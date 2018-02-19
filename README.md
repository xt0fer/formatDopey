# formatDopey

so if you were to need to "truncate" the precision of a double, to say 2 decimal places, you might 
have more than ones way to do it.

The Fast way is (mathy)
```Java
double samson = 18945.89374297492742393874;

double shorn = Math.floor(samson * 100) / 100;
```

or you might think, {I'll just format it to a string and parse it back,
using the DecimalFormat thingie.

The Slow way is (crufty)

```Java
DecimalFormat grading = new DecimalFormat("#.##");

double shorn =  Double.parseDouble(grading.format(samson));
```

(on a macbook pro)

mathy takes 10ms to do it 10 million times.

crufty takes 7297ms to it 10 million times.

700% slower.