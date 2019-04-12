package com.example.taxamoutcalulator_sujan;

class Tax_Sujan {
    private float salary,taxamount;

    public Tax_Sujan(float sal){
        this.salary=sal;
    }

    public float taxcalculation(){
        if (salary>1 && salary<200000){
            taxamount = salary * 1/100;
            return taxamount;

        }
        else if (salary>200000 && salary <350000) {
            taxamount = (200000 * 1/100) +(salary-200000)*15/100;
         return taxamount;
        }
        else {
            taxamount = (200000 * 1/100) + (150000*15/100) + (salary - 350000)*25/100;
          return taxamount;
        }
    }
}
