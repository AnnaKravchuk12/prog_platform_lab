package lab1;

public class Fraction {

 private int chis, znam;
 
 protected int commonDenominator(int zn1, int zn2) {
  return 0;
 }
 
 public int euklid (int a, int b) {
  while (b !=0 && a !=0) {
   if(a > b) a = a % b;
   else b = b % a;
  }
  return a + b;
 }
 
 
 public Fraction(int chis, int znam) {
  this.chis = chis; this.znam = znam;
 }
 
 public int calcGCD(int chis, int znam) {
  if (chis % znam == 0) {
              return znam;
         }
  return calcGCD(znam, chis % znam);
  }
 void reduce() {
  int gcd = calcGCD(chis, znam);
  chis /= gcd;
  znam /= gcd;
     }
 
 public Fraction add(Fraction f) {
  int chis = (this.chis * f.getZnam()) +  (f.getChis() * znam);
  int znam = this.znam * f.getZnam();
  return new Fraction(chis, znam);
  
 }
 
 public Fraction sub(Fraction f) {
        int newChis = (this.chis * f.znam) - 
                                 (f.chis * znam);
 int newZnam = this.znam * f.znam;
 Fraction result = new Fraction(newChis, newZnam);
 return result;
    }
 
 public Fraction mul(Fraction f) {
  int newChis = this.chis * f.chis;
  int newZnam = this.znam * f.znam;
  Fraction result = new Fraction(newChis, newZnam);
  return result;
 }

 public Fraction div(Fraction f) {
  int newChis = this.chis * f.getZnam();
  int newZnam = this.znam * f.chis;
  Fraction result = new Fraction(newChis, newZnam);
  return result;
     }
 
 
 @Override
 public String toString() {
  return chis + "/" + znam;
 }

 @Override
 public boolean equals(Object o) {
  if(this == o) return true;
  //...
  return false;
 }
 
 public int getChis() {
  return chis;
 }
 
 public int getZnam() {
  return znam;
 }

}
