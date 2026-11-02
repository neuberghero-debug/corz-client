package gg.corz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.IntPredicate;

public final class IiilIiiliilIii {
   private iiiliillIIIiiill iIiIIIiIIl = iiiliillIIIiiill.iIIIiiiill;
   private final int[] IIiIIIiIIl;
   public static final double IllIIIiIIl = 1.5;
   private final int[] lilIIIiIIl;
   public int liiIIIiIIl;
   public int lIIlIIiIIl;
   private int IliIIIiIIl = -1000;
   public static final int iIlIIIiIIl = 1;
   private String IlIlIIiIIl = "";
   public static final int IIlIIIiIIl = 30;
   private int iliIIIiIIl;
   public static final int lIlIIIiIIl = 4;
   public int iIIlIIiIIl;
   private int lliIIIiIIl;
   private final byte[] lIiIIIiIIl;
   public static final double iiIIIIiIIl = 1.6;
   public static final double lllIIIiIIl = 1.3;
   public int iiiIIIiIIl;
   public int IIIlIIiIIl;
   private final lilliIIiiilliIIi illIIIiIIl;
   private final int[] iilIIIiIIl;
   private final iiIIIilIIlIIil[] IilIIIiIIl;
   public int IiiIIIiIIl;
   public static final double liIIIIiIIl = 2.2;

   public lilliIIiiilliIIi iIlIlllllill() {
      return this.illIIIiIIl;
   }

   public void IIiilIiiiIii(int tick, IntPredicate placed) {
      long var9 = 1379802981526675048L;
      long var11 = 5846345031956031217L;

      for (var9 ^= (0L ^ var9) & -1L << 32; (int)(var9 >>> 32) < this.IilIIIiIIl.length; var9 += 4294967296L) {
         if (this.IilIIIiIIl[(int)(var9 >>> 32)] == iiIIIilIIlIIil.iliiillIiIiiiillIi) {
            if (placed.test((int)(var9 >>> 32))) {
               this.IilIIIiIIl[(int)(var9 >>> 32)] = iiIIIilIIlIIil.liiiillIiiiiiillIi;
               this.IiiIIIiIIl++;
               this.iliIIIiIIl = tick;
            } else if (tick - this.lilIIIiIIl[(int)(var9 >>> 32)] > 30) {
               if (this.iilIIIiIIl[(int)(var9 >>> 32)]++ < 1) {
                  this.IilIIIiIIl[(int)(var9 >>> 32)] = iiIIIilIIlIIil.IliiillIilliiillIi;
                  this.lilIIIiIIl[(int)(var9 >>> 32)] = 0;
                  this.iiiIIIiIIl++;
               } else {
                  this.IilIIIiIIl[(int)(var9 >>> 32)] = iiIIIilIIlIIil.iIIIIilIiIlIIIilIi;
                  this.IIIlIIiIIl++;
               }
            }
         }
      }

      var9 ^= (0L ^ var9) & -1L << 32;
      var9 ^= (0L ^ var9) & -1L >>> 32;
      iiIIIilIIlIIil[] var5 = this.IilIIIiIIl;
      var11 ^= ((long)var5.length << 32 ^ var11) & -1L << 32;

      for (long var17 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var17 < (int)(var17 >>> 32); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
         iiIIIilIIlIIil var8 = var5[(int)var17];
         if (var8 == iiIIIilIIlIIil.IliiillIilliiillIi) {
            var9 ^= (4294967296L ^ var9) & -1L << 32;
         }

         if (var8 == iiIIIilIIlIIil.iliiillIiIiiiillIi) {
            var9 ^= (1L ^ var9) & -1L >>> 32;
         }
      }

      if (this.iIiIIIiIIl == iiiliillIIIiiill.IlIIiiiill && (int)(var9 >>> 32) == 0) {
         this.iIiIIIiIIl = (int)var9 != 0 ? iiiliillIIIiiill.llIIiiiill : iiiliillIIIiiill.ilIIiiiill;
      }

      if (this.iIiIIIiIIl == iiiliillIIIiiill.llIIiiiill && (int)var9 == 0) {
         this.iIiIIIiIIl = iiiliillIIIiiill.ilIIiiiill;
      }
   }

   public int Ililllililil() {
      long var2 = 4397866344984332067L;

      for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < this.IilIIIiIIl.length; var4 += 4294967296L) {
         if (this.IilIIIiIIl[(int)(var4 >>> 32)] == iiIIIilIIlIIil.IliiillIilliiillIi) {
            return (int)(var4 >>> 32);
         }
      }

      return -1;
   }

   public int IliIlllilIi(int i) {
      return i >= 0 && i < this.lilIIIiIIl.length && this.lilIIIiIIl[i] > 0 ? 1 : 0;
   }

   public double Iiilliiliiil() {
      long var3 = 5696436680655697113L;

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IilIIIiIIl.length; var5 += 4294967296L) {
         if (this.IilIIIiIIl[(int)(var5 >>> 32)] == iiIIIilIIlIIil.IliiillIilliiillIi) {
            return this.IIlllIlliIll((int)(var5 >>> 32));
         }
      }

      long var1 = this.illIIIiIIl.Iilllilliill();
      return (double)(this.illIIIiIIl.IIIllIIliIIl() == 0 ? llIiIiililIiIiil.IiIlliIliiIl(var1) : llIiIiililIiIiil.Illlllllilll(var1)) + 0.5;
   }

   public void Iliilliiilii(int i, String why) {
      if (this.IilIIIiIIl[i] == iiIIIilIIlIIil.IliiillIilliiillIi || this.IilIIIiIIl[i] == iiIIIilIIlIIil.iliiillIiIiiiillIi) {
         this.IilIIIiIIl[i] = iiIIIilIIlIIil.iIIIIilIiIlIIIilIi;
         this.IIIlIIiIIl++;
         this.IlIlIIiIIl = why;
      }
   }

   public void Illillliilli(int i) {
      if (this.lIiIIIiIIl[i] == 1) {
         this.lIiIIIiIIl[i] = 2;
      }
   }

   public List<Long> iiIIlIIlIl() {
      long var3 = -5753437763816428370L;
      ArrayList var1 = new ArrayList();

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IilIIIiIIl.length; var5 += 4294967296L) {
         if (this.IilIIIiIIl[(int)(var5 >>> 32)] != iiIIIilIIlIIil.liiiillIiiiiiillIi) {
            var1.add(this.illIIIiIIl.iliIiiliiiii().get((int)(var5 >>> 32)).IliIlllilIi());
         }
      }

      return var1;
   }

   public void IlIlllIlilIl(int tick) {
      this.iIiIIIiIIl = iiiliillIIIiiill.IlIIiiiill;
      this.iliIIIiIIl = tick;
   }

   public iiiliillIIIiiill IilliliilIIi() {
      return this.iIiIIIiIIl;
   }

   public int IiIIlliIIl() {
      long var6 = 8279033371384102737L;
      long var8 = -1442369537785328313L;
      var6 ^= (0L ^ var6) & -1L << 32;
      iiIIIilIIlIIil[] var2 = this.IilIIIiIIl;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;

      for (long var12 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var12 >>> 32) < (int)var6; var12 += 4294967296L) {
         iiIIIilIIlIIil var5 = var2[(int)(var12 >>> 32)];
         if (var5 == iiIIIilIIlIIil.IliiillIilliiillIi) {
            var6 += 4294967296L;
         }
      }

      return (int)(var6 >>> 32);
   }

   private double IIlllIlliIll(int i) {
      long var2 = this.illIIIiIIl.iliIiiliiiii().get(i).liiiIIllIl();
      return (double)(this.illIIIiIIl.IIIllIIliIIl() == 0 ? llIiIiililIiIiil.IiIlliIliiIl(var2) : llIiIiililIiIiil.Illlllllilll(var2)) + 0.5;
   }

   public String lIiiIiIlilli() {
      return this.IlIlIIiIIl;
   }

   public void IlIillIiilIi(int i, int tick) {
      this.IilIIIiIIl[i] = iiIIIilIIlIIil.iliiillIiIiiiillIi;
      this.lilIIIiIIl[i] = tick;
      this.IliIIIiIIl = tick;
      this.liiIIIiIIl++;
      if (this.illIIIiIIl.iliIiiliiiii().get(i).iliIiiliiiii()) {
         this.lIIlIIiIIl++;
      }

      this.iliIIIiIIl = tick;
   }

   public int llIIlilIIl() {
      long var6 = -4838048329979220045L;
      long var8 = 4082527526816880431L;
      var6 ^= (0L ^ var6) & -1L << 32;
      iiIIIilIIlIIil[] var2 = this.IilIIIiIIl;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;

      for (long var12 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var12 >>> 32) < (int)var6; var12 += 4294967296L) {
         iiIIIilIIlIIil var5 = var2[(int)(var12 >>> 32)];
         if (var5 == iiIIIilIIlIIil.IliiillIilliiillIi || var5 == iiIIIilIIlIIil.iliiillIiIiiiillIi) {
            var6 += 4294967296L;
         }
      }

      return (int)(var6 >>> 32);
   }

   public int liiiIIllIl(int i) {
      return i >= 0 && i < this.IilIIIiIIl.length && this.IilIIIiIIl[i] == iiIIIilIIlIIil.liiiillIiiiiiillIi ? 1 : 0;
   }

   public double IiIlliIliiIl(double x, double z) {
      return this.illIIIiIIl.IIIllIIliIIl() == 0 ? x : z;
   }

   public IiilIiiliilIii(lilliIIiiilliIIi run) {
      this.illIIIiIIl = run;
      this.IilIIIiIIl = new iiIIIilIIlIIil[run.IliIlllilIi()];
      this.lilIIIiIIl = new int[run.IliIlllilIi()];
      this.iilIIIiIIl = new int[run.IliIlllilIi()];
      this.IIiIIIiIIl = new int[run.IliIlllilIi()];
      this.lIiIIIiIIl = new byte[run.IliIlllilIi()];
      Arrays.fill(this.IilIIIiIIl, iiIIIilIIlIIil.IliiillIilliiillIi);
      Arrays.fill(this.IIiIIIiIIl, -1000);
   }

   public void iIIIlIlIIl(String why) {
      this.iIiIIIiIIl = iiiliillIIIiiill.IiIIiiiill;
      this.IlIlIIiIIl = why;
   }

   public int Iilililiiili(int i) {
      return this.IIiIIIiIIl[i];
   }

   public double IIillIiliIil(int bodyZ, double i, double bodyX) {
      return (this.IIlllIlliIll(bodyZ) - this.IiIlliIliiIl(i, bodyX)) * (double)this.illIIIiIIl.IlIlllIlilIl();
   }

   public void IiIiliIiiiIi(int tick, int i) {
      if (this.lIiIIIiIIl[tick] != 1) {
         this.lIiIIIiIIl[tick] = 1;
         this.iIIlIIiIIl++;
      }

      this.IIiIIIiIIl[tick] = i;
   }

   public boolean Iiiiliiiiiii(int tick, int ticks) {
      return this.iIiIIIiIIl == iiiliillIIIiiill.IlIIiiiill && tick - this.iliIIIiIIl > ticks;
   }

   public boolean IIIilIIiiIIi(int tick) {
      return tick - this.IliIIIiIIl >= 4;
   }

   public void IIIIllIIIl(int tick) {
      this.iliIIIiIIl = tick;
   }

   public int IIIllIIliIIl(int i) {
      return this.lilIIIiIIl[i];
   }

   public boolean Iilllilliill(int i) {
      long var4 = -8451663940643030283L;
      lilIlilliilIlill var2 = this.illIIIiIIl.iliIiiliiiii().get(i);
      var4 ^= (
            (long)(
                     this.illIIIiIIl.IIIllIIliIIl() == 0
                        ? llIiIiililIiIiil.Illlllllilll(var2.IliIlllilIi()) - llIiIiililIiIiil.Illlllllilll(var2.liiiIIllIl())
                        : llIiIiililIiIiil.IiIlliIliiIl(var2.IliIlllilIi()) - llIiIiililIiIiil.IiIlliIliiIl(var2.liiiIIllIl())
                  )
                  << 32
               ^ var4
         )
         & -1L << 32;
      return Math.abs((int)(var4 >>> 32)) >= 2;
   }

   public boolean IIlilIliiIli(int i) {
      return this.lIiIIIiIIl[i] == 1;
   }

   public int Illlllllilll(double bodyX, double bodyZ) {
      long var15 = 7214077862120651074L;
      double var5 = this.IiIlliIliiIl(bodyX, bodyZ);

      for (long var17 = var15 ^ (0L ^ var15) & -1L << 32; (int)(var17 >>> 32) < this.IilIIIiIIl.length; var17 += 4294967296L) {
         if (this.IilIIIiIIl[(int)(var17 >>> 32)] == iiIIIilIIlIIil.IliiillIilliiillIi) {
            double var8 = (this.IIlllIlliIll((int)(var17 >>> 32)) - var5) * (double)this.illIIIiIIl.IlIlllIlilIl();
            var17 ^= ((long)this.Iilllilliill((int)(var17 >>> 32)) ^ var17) & -1L >>> 32;
            double var11 = (int)var17 != 0 ? 1.5 : 2.2;
            double var13 = (int)var17 != 0 ? 1.3 : 1.6;
            if (var8 >= -var13 && var8 <= var11) {
               return (int)(var17 >>> 32);
            }

            if (var8 > var11) {
               return -1;
            }
         }
      }

      return -1;
   }

   public String lIlIliIlIl(int tick) {
      return String.format(
         Locale.ROOT,
         IllIllllIl<"IllIllllIl","UA9qi1Zb0GnkN069pxbfOT1Sx6W8myeKNxrCnHlBz3ssp+2Grr5UwoyjddAkDLNENWZS0o8ZSlFiqWXlScICSkQIBHKt1aeuR/D4RhIZHjc93C3I7fgjY39IRnHIrguHA6f499AM34ARKIZziQ2CUBQLN7pTJomLAJcnv49kaWosy4k+2GnwrH1kwZyN9DDuF4gs9zvmNGCaon2fLSXqw2yWdK+I1CYZo3IWYw==">(),
         this.illIIIiIIl.lIiiIiIlilli(),
         this.iIiIIIiIIl,
         this.illIIIiIIl.IliIlllilIi(),
         this.IiiIIIiIIl,
         this.liiIIIiIIl,
         this.lIIlIIiIIl,
         this.iIIlIIiIIl,
         this.iiiIIIiIIl,
         this.IIIlIIiIIl,
         this.llIIlilIIl(),
         this.illIIIiIIl.IIIllIIliIIl(),
         this.illIIIiIIl.IlIlllIlilIl(),
         this.IlIlIIiIIl
      );
   }

   public iiIIIilIIlIIil iliIiiliiiii(int i) {
      return this.IilIIIiIIl[i];
   }
}
