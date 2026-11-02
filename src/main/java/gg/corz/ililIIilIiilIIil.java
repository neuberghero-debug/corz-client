package gg.corz;

import net.minecraft.class_1309;
import net.minecraft.class_243;

public final class ililIIilIiilIIil {
   private int iIIillIIil;
   private int IiilllIIil;
   private String IIllllIIil;
   private int ililllIIil;
   public static final double IiIlllIIil = 2.0;
   private long IlllllIIil;
   private long iIllllIIil;
   private class_243 lillllIIil;
   private int liilllIIil;
   private double iIilllIIil;
   private double IIilllIIil;
   private long illlllIIil;
   private int lIIillIIil;
   private class_243 iillllIIil;
   private long lIllllIIil;
   public static final double liIlllIIil = 0.5;
   private double lIilllIIil;
   public static final long ilIlllIIil = 80L;
   private int iiilllIIil;
   private int IillllIIil;
   private int llilllIIil;
   private boolean IlilllIIil;
   private int iiIlllIIil = -1;
   private long llllllIIil;

   public long IIIilIIiiIIi(long tick) {
      return this.IlllllIIil == Long.MIN_VALUE ? 2147483647L : Math.max(0L, tick - this.IlllllIIil);
   }

   public void liiiIIllIl(class_1309 e, double gap) {
      if (e != null && e.method_5628() == this.iiIlllIIil) {
         class_243 var4 = new class_243(e.method_23317(), e.method_23318(), e.method_23321());
         class_243 var5 = this.lillllIIil == null ? class_243.field_1353 : var4.method_1020(this.lillllIIil);
         this.iillllIIil = !(var5.method_1027() > 4.0) && Double.isFinite(var5.method_1027()) ? var5 : class_243.field_1353;
         this.lillllIIil = var4;
         double var6 = Double.isFinite(this.IIilllIIil) && Double.isFinite(gap) ? this.IIilllIIil - gap : 0.0;
         this.lIilllIIil = llIIliiilIIlii.IIlilIliiIli(this.lIilllIIil, var6, 0.5);
         this.IIilllIIil = gap;
         this.iIilllIIil = iIIiIIilIlIiIIil.IliIlllilIi(e.method_6047());
      }
   }

   public int Iliilliiilii() {
      return this.liilllIIil;
   }

   public double Iilllilliill() {
      return this.iIilllIIil;
   }

   public int IiIiliIiiiIi() {
      return this.IillllIIil;
   }

   public String IiIlliIliiIl() {
      return this.IIllllIIil;
   }

   public boolean IIlilIliiIli(int tick, long entityId, long window) {
      return tick >= 0 && tick == this.IillllIIil && this.illlllIIil != Long.MIN_VALUE && entityId - this.illlllIIil <= window;
   }

   public int IIIIllIIIl() {
      return this.lIIillIIil;
   }

   public boolean iliIiiliiiii(class_1309 tick, long e) {
      if (this.IlilllIIil || tick == null || tick.method_5628() != this.iiIlllIIil) {
         return false;
      } else if (!tick.method_29504() && !(tick.method_6032() <= 0.0F)) {
         return false;
      } else if (this.iIllllIIil != Long.MIN_VALUE && e - this.iIllllIIil <= 80L) {
         this.IlilllIIil = true;
         this.iIIillIIil++;
         this.IiilllIIil = 0;
         return true;
      } else {
         return false;
      }
   }

   public void iIlIlllllill(int entityId, long tick) {
      if (entityId == this.iiIlllIIil && this.iiIlllIIil >= 0) {
         this.lIllllIIil = tick;
      }
   }

   public long IIillIiliIil(long tick) {
      return this.lIllllIIil == Long.MIN_VALUE ? 2147483647L : Math.max(0L, tick - this.lIllllIIil);
   }

   public void IIIllIIliIIl() {
      this.IliIlllilIi(null);
      this.IlllllIIil = Long.MIN_VALUE;
      this.illlllIIil = Long.MIN_VALUE;
      this.IillllIIil = -1;
   }

   public int IlIlllIlilIl() {
      return this.iiIlllIIil;
   }

   public ililIIilIiilIIil() {
      this.lIllllIIil = Long.MIN_VALUE;
      this.iIllllIIil = Long.MIN_VALUE;
      this.IlllllIIil = Long.MIN_VALUE;
      this.llllllIIil = Long.MIN_VALUE;
      this.illlllIIil = Long.MIN_VALUE;
      this.IillllIIil = -1;
      this.iillllIIil = class_243.field_1353;
      this.IIilllIIil = Double.NaN;
      this.iIilllIIil = 4.0;
   }

   public int Iilililiiili() {
      return this.ililllIIil;
   }

   public int Illillliilli() {
      return this.llilllIIil;
   }

   public int Iiiiliiiiiii() {
      return this.iiilllIIil;
   }

   public float Ililllililil(long tick) {
      return llIIliiilIIlii.IlIlllIlilIl(this.IIillIiliIil(tick), this.iIilllIIil);
   }

   public long Iiilliiliiil(long tick) {
      return this.iIllllIIil == Long.MIN_VALUE ? 2147483647L : Math.max(0L, tick - this.iIllllIIil);
   }

   public void IliIlllilIi(class_1309 e) {
      long var3 = 8119092310171125270L;
      var3 ^= ((long)(e == null ? -1 : e.method_5628()) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) != this.iiIlllIIil) {
         this.iiIlllIIil = (int)(var3 >>> 32);
         this.IIllllIIil = e == null ? null : e.method_5477().getString();
         this.lIllllIIil = Long.MIN_VALUE;
         this.iIllllIIil = Long.MIN_VALUE;
         this.llllllIIil = Long.MIN_VALUE;
         this.lillllIIil = null;
         this.iillllIIil = class_243.field_1353;
         this.IIilllIIil = Double.NaN;
         this.lIilllIIil = 0.0;
         this.iIilllIIil = 4.0;
         this.IiilllIIil = 0;
         this.IlilllIIil = false;
      }
   }

   public int iIIIlIlIIl() {
      return this.iIIillIIil;
   }

   public void IilliliilIIi(int entityId, int causeId, int tick, long selfId) {
      if (entityId == tick && causeId >= 0 && causeId != tick) {
         this.IillllIIil = causeId;
         this.illlllIIil = selfId;
      }

      if (this.iiIlllIIil >= 0) {
         if (entityId == this.iiIlllIIil) {
            this.llllllIIil = selfId;
            if (causeId == tick) {
               this.llilllIIil++;
               this.IiilllIIil++;
               this.liilllIIil = Math.max(this.liilllIIil, this.IiilllIIil);
               this.iIllllIIil = selfId;
            }
         } else if (entityId == tick && causeId == this.iiIlllIIil) {
            this.ililllIIil++;
            this.IiilllIIil = 0;
            this.IlllllIIil = selfId;
         }
      }
   }

   public double Illlllllilll() {
      return this.lIilllIIil;
   }

   public long IlIillIiilIi(long tick) {
      return this.llllllIIil == Long.MIN_VALUE ? 2147483647L : Math.max(0L, tick - this.llllllIIil);
   }

   public void lIiiIiIlilli(int selfId, int entityId) {
      if (selfId == this.iiIlllIIil && this.iiIlllIIil >= 0) {
         this.iiilllIIil++;
      } else if (selfId == entityId) {
         this.lIIillIIil++;
      }
   }

   public int IIiilIiiiIii() {
      return this.IiilllIIil;
   }

   public class_243 IIlllIlliIll() {
      return this.iillllIIil;
   }
}
