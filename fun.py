def is_leap(year):
    leap = False
    
    # Write your logic here
    if(year%4==0):
        
        if year % 100==0:
            if year % 400==0:
                leap = True
        else:
            leap = True
                   
    
    return leap

year = int(input())

if (year%4==0) and (year % 100!=0 or year % 400==0):