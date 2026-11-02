package gg.corz;

public final class iiiIiIIlIIIliIIl {
   public static final long IilllIilIl = 900000000L;
   private long iIillIilIl;
   private long lIillIilIl;
   private long iilllIilIl;
   private long IIillIilIl;
   public static final long lilllIilIl = 480000000L;

   public long lIiiIiIlilli() {
      return this.iilllIilIl;
   }

   public static double IiIlliIliiIl(double t) {
      if (!(t > 0.0)) {
         return 0.0;
      } else if (t >= 1.0) {
         return 1.0;
      } else {
         double var2 = 1.0 - t;
         return 1.0 - var2 * var2 * var2 * var2;
      }
   }

   public iiiIiIIlIIIliIIl(long value) {
      this.IliIlllilIi(value);
   }

   public boolean iIlIlllllill(long lengthNs, long target, long nowNs) {
      long var7 = Math.max(0L, lengthNs);
      if (var7 == this.IIillIilIl) {
         return false;
      } else {
         this.liiiIIllIl(this.IlIlllIlilIl(target), var7, target, nowNs);
         return true;
      }
   }

   public void liiiIIllIl(long target, long fromValue, long lengthNs, long atNs) {
      this.iilllIilIl = Math.max(0L, target);
      this.IIillIilIl = Math.max(0L, fromValue);
      this.lIillIilIl = lengthNs;
      this.iIillIilIl = Math.max(0L, atNs);
   }

   public long IilliliilIIi() {
      return this.IIillIilIl;
   }

   public boolean iliIiiliiiii(long nowNs) {
      return this.iIillIilIl <= 0L || this.iilllIilIl == this.IIillIilIl || nowNs - this.lIillIilIl >= this.iIillIilIl;
   }

   public long IlIlllIlilIl(long nowNs) {
      if (this.iliIiiliiiii(nowNs)) {
         return this.IIillIilIl;
      } else if (nowNs <= this.lIillIilIl) {
         return this.iilllIilIl;
      } else {
         double var3 = IiIlliIliiIl((double)(nowNs - this.lIillIilIl) / (double)this.iIillIilIl);
         long var5 = Math.max(this.iilllIilIl, this.IIillIilIl) - Math.min(this.iilllIilIl, this.IIillIilIl);
         long var7 = Math.min(var5, (long)Math.floor((double)var5 * var3));
         return this.IIillIilIl >= this.iilllIilIl ? this.iilllIilIl + var7 : this.iilllIilIl - var7;
      }
   }

   public float IIIllIIliIIl(long nowNs) {
      if (this.iliIiiliiiii(nowNs)) {
         return 1.0F;
      } else {
         return nowNs <= this.lIillIilIl ? 0.0F : (float)IiIlliIliiIl((double)(nowNs - this.lIillIilIl) / (double)this.iIillIilIl);
      }
   }

   public void IliIlllilIi(long value) {
      this.iilllIilIl = this.IIillIilIl = Math.max(0L, value);
      this.iIillIilIl = 0L;
   }
}
