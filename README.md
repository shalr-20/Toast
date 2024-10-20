# Toast
```
Toast.LENGTH_SHORT: The Toast appears for a short time.

Toast.LENGTH_LONG: The Toast appears for a long time.
```

## Toast Syntax (By Default)
```
Toast.makeText(Context, text, duration).show();
```
  
**Context**: _Activity where the text will be displayed_

**Text**: _What text is to be displayed_

**Duration**: _For how long the text will be displayed_


## Toast Syntax (For Gravity)
```
Toast toast = Toast.makeText(Context, Charsequence, duration);

toast.setGravity(Gravity.CENTER,1,2);

toast.show();
```
  
**Gravity.CENTER**: _Text will be displayed in the center_

**1**: _x-axis_

**2**: _y-axis_


## Toast Syntax (For Nested Gravity)
```
Toast toast=Toast.makeText(MainActivity.this, "This is Simple Gravity Toast",Toast.LENGTH_SHORT);

toast.setGravity(Gravity.BOTTOM | Gravity.RIGHT,0,0);

toast.show();
```
**Gravity.BOTTOM | Gravity.END**: _Text will be displayed in the bottom right corner_
