package gg.corz;

public class liIliIliiIliIl implements Cloneable {
   private double iillIlillIIilIlill;
   private boolean IlilIlillllilIlill;
   private long llllIlillilllIlill;
   private double lIilIlilliIilIlill;
   private double IillIlilllillIlill;
   private final llIIIliilIIIli IIllIlilllIllIlill;
   private int iIllIlillIlllIlill;

   public long IlIlllIlilIl() {
      return (System.nanoTime() - this.llllIlillilllIlill) / 1000000L;
   }

   public int iliIiiliiiii() {
      return this.iIllIlillIlllIlill;
   }

   public void IliIlllilIi() {
      this.llllIlillilllIlill = System.nanoTime();
      this.IlilIlillllilIlill = true;
      this.IillIlilllillIlill = this.lIilIlilliIilIlill;
   }

   public double iIlIlllllill() {
      this.IIlllIlliIll();
      return this.lIilIlilliIilIlill;
   }

   public void liiiIIllIl(long millis) {
      this.llllIlillilllIlill = System.nanoTime() - (System.currentTimeMillis() - millis) * 1000000L;
   }

   public liIliIliiIliIl(llIIIliilIIIli durationMillis, int easing) {
      this(durationMillis, easing, 0.0);
   }

   public void IilliliilIIi(double value) {
      this.IillIlilllillIlill = value;
      this.iillIlillIIilIlill = value;
      this.lIilIlilliIilIlill = value;
      this.IlilIlillllilIlill = false;
   }

   public double IiIlliIliiIl() {
      return this.iillIlillIIilIlill;
   }

   public void IIIllIIliIIl(int durationMillis) {
      this.iIllIlillIlllIlill = durationMillis;
   }

   public liIliIliiIliIl clone() {
      liIliIliiIliIl var1 = new liIliIliiIliIl(this.IIllIlilllIllIlill, this.iIllIlillIlllIlill);
      var1.llllIlillilllIlill = this.llllIlillilllIlill;
      var1.IillIlilllillIlill = this.IillIlilllillIlill;
      var1.iillIlillIIilIlill = this.iillIlillIIilIlill;
      var1.lIilIlilliIilIlill = this.lIilIlilliIilIlill;
      var1.IlilIlillllilIlill = this.IlilIlillllilIlill;
      return var1;
   }

   public void lIiiIiIlilli(double target) {
      this.IillIlilllillIlill = this.lIilIlilliIilIlill;
      this.iillIlillIIilIlill = target;
      this.llllIlillilllIlill = System.nanoTime();
      this.IlilIlillllilIlill = true;
   }

   public liIliIliiIliIl(llIIIliilIIIli easing, int initialValue, double durationMillis) {
      this.IIllIlilllIllIlill = easing;
      this.iIllIlillIlllIlill = initialValue;
      this.IillIlilllillIlill = durationMillis;
      this.iillIlillIIilIlill = durationMillis;
      this.lIilIlilliIilIlill = durationMillis;
      this.llllIlillilllIlill = System.nanoTime();
      this.IlilIlillllilIlill = false;
   }

   private void IIlllIlliIll() {
      if (this.IlilIlillllilIlill) {
         double var1 = (double)(System.nanoTime() - this.llllIlillilllIlill) / 1000000.0;
         if (var1 >= (double)this.iIllIlillIlllIlill) {
            this.lIilIlilliIilIlill = this.iillIlillIIilIlill;
            this.IlilIlillllilIlill = false;
         } else {
            double var3 = this.IIllIlilllIllIlill.liiiIIllIl(var1 / (double)this.iIllIlillIlllIlill);
            this.lIilIlilliIilIlill = this.IillIlilllillIlill + (this.iillIlillIIilIlill - this.IillIlilllillIlill) * var3;
         }
      }
   }
}
