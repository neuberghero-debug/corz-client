package gg.corz;

import java.util.Arrays;

public final class IllIilIilllIilIi {
   private boolean IlIIIllIIi;
   private static final int iIliiIlIIi = 20;
   private boolean lIiiiIlIIi;
   private final int[] illiiIlIIi;
   private boolean lIIIIllIIi;
   private int IIiiiIlIIi;
   private float iiiiiIlIIi;
   private int liliiIlIIi;
   private static final float lIliiIlIIi = 89.9999F;
   private int IliiiIlIIi;
   private static final int IlliiIlIIi = 16;
   private boolean lliiiIlIIi;
   private final int[] IiliiIlIIi;
   private boolean ilIIIllIIi;
   private int iIiiiIlIIi;
   private int iiliiIlIIi;
   private static final float iiIiiIlIIi = 0.02F;
   private boolean llIIIllIIi;
   private final int[] llliiIlIIi = new int[IIlIilillIlIilil.values().length];
   private boolean iIIIIllIIi;
   private boolean liiiiIlIIi;
   private int IiiiiIlIIi;
   private float IIIIIllIIi;
   private boolean iliiiIlIIi;
   private static final float IIliiIlIIi = 1.0E-4F;

   public void IlIlllIlilIl(float yaw, float pitch) {
      long var4 = 2134689996556229999L;
      var4 ^= ((long)(!this.liiiiIlIIi || !(Math.abs(yaw - this.iiiiiIlIIi) > 1.0E-4F) && !(Math.abs(pitch - this.IIIIIllIIi) > 1.0E-4F) ? 0 : 1) << 32 ^ var4)
         & -1L << 32;
      if (this.llIIIllIIi) {
         this.llIIIllIIi = false;
         if ((int)(var4 >>> 32) != 0) {
            this.IlIillIiilIi(IIlIilillIlIilil.IliliIIlil, this.ilIIIllIIi);
         }
      } else {
         if (this.iIIIIllIIi && this.IlIIIllIIi) {
            this.IlIillIiilIi(IIlIilillIlIilil.IliliIIlil, false);
         }

         this.iIIIIllIIi = true;
         this.IlIIIllIIi = (boolean)((int)(var4 >>> 32));
      }
   }

   public void liiiIIllIl() {
      if (this.iIIIIllIIi) {
         if (this.IlIIIllIIi) {
            this.IlIillIiilIi(IIlIilillIlIilil.IliliIIlil, false);
         }

         this.iIIIIllIIi = false;
      }

      this.IiIiliIiiiIi();
      this.liliiIlIIi = (this.liliiIlIIi + 1) % 20;
      this.iiliiIlIIi = this.iiliiIlIIi - this.IiliiIlIIi[this.liliiIlIIi];
      this.IiliiIlIIi[this.liliiIlIIi] = 0;
   }

   public int IIillIiliIil() {
      long var6 = -935496948684824714L;
      long var8 = -2408958180499794531L;
      var6 ^= (0L ^ var6) & -1L << 32;
      int[] var2 = this.illiiIlIIi;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;
      var8 ^= (0L ^ var8) & -1L << 32;

      while ((int)(var8 >>> 32) < (int)var6) {
         var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
         var6 ^= ((long)((int)(var6 >>> 32) + (int)var8) << 32 ^ var6) & -1L << 32;
         var8 += 4294967296L;
      }

      return (int)(var6 >>> 32);
   }

   private void IiIiliIiiiIi() {
      this.IIiiiIlIIi = 0;
      this.lIiiiIlIIi = false;
      this.iIiiiIlIIi = 0;
      this.IliiiIlIIi = 0;
      this.lliiiIlIIi = false;
      this.iliiiIlIIi = false;
      this.iIIIIllIIi = false;
      this.IlIIIllIIi = false;
      this.llIIIllIIi = false;
      this.ilIIIllIIi = false;
   }

   public void Illlllllilll(double own, double distance, boolean limit) {
      if (Double.isNaN(own) || own > distance) {
         this.IlIillIiilIi(IIlIilillIlIilil.liiliIIlil, limit);
      }
   }

   public void IIIllIIliIIl(boolean yaw, float botDriving, float hasLook, float gcd, boolean pitch) {
      long var9 = 6420404985428873547L;
      if (this.lliiiIlIIi) {
         this.lliiiIlIIi = false;
      } else {
         this.IliiiIlIIi++;
         if (this.IliiiIlIIi > 1) {
            this.IlIillIiilIi(IIlIilillIlIilil.illliIIlil, false);
         }
      }

      if (yaw) {
         if (Math.abs(hasLook) > 90.0F) {
            this.IlIillIiilIi(IIlIilillIlIilil.iIiliIIlil, pitch);
         }

         if (this.liiiiIlIIi) {
            float var6 = botDriving - this.iiiiiIlIIi;
            float var7 = hasLook - this.IIIIIllIIi;
            if (Math.abs(var6) >= 180.0F && !this.iliiiIlIIi) {
               this.IlIillIiilIi(IIlIilillIlIilil.lIiliIIlil, pitch);
            }

            var9 ^= ((long)(!(Math.abs(hasLook) >= 89.9999F) && !(Math.abs(this.IIIIIllIIi) >= 89.9999F) ? 0 : 1) << 32 ^ var9) & -1L << 32;
            if (pitch && !this.iliiiIlIIi && (int)(var9 >>> 32) == 0 && (!IIIilIIiiIIi(var6, gcd) || !IIIilIIiiIIi(var7, gcd))) {
               this.IlIillIiilIi(IIlIilillIlIilil.IIiliIIlil, true);
            }
         }

         this.liiiiIlIIi = true;
         this.iiiiiIlIIi = botDriving;
         this.IIIIIllIIi = hasLook;
      }
   }

   public void IliIlllilIi() {
      Arrays.fill(this.llliiIlIIi, 0);
      Arrays.fill(this.illiiIlIIi, 0);
      Arrays.fill(this.IiliiIlIIi, 0);
      this.liliiIlIIi = 0;
      this.iiliiIlIIi = 0;
      this.IiIiliIiiiIi();
      this.IiiiiIlIIi = -1;
      this.liiiiIlIIi = false;
      this.iiiiiIlIIi = 0.0F;
      this.IIIIIllIIi = 0.0F;
      this.lIIIIllIIi = false;
   }

   public int Iilllilliill(IIlIilillIlIilil rule) {
      return rule == null ? 0 : this.llliiIlIIi[rule.ordinal()];
   }

   private void IlIillIiilIi(IIlIilillIlIilil rule, boolean own) {
      this.llliiIlIIi[rule.ordinal()]++;
      if (own) {
         this.illiiIlIIi[rule.ordinal()]++;
      }
   }

   public IllIilIilllIilIi() {
      this.illiiIlIIi = new int[IIlIilillIlIilil.values().length];
      this.IiliiIlIIi = new int[20];
      this.IiiiiIlIIi = -1;
   }

   public void IiIlliIliiIl(boolean own) {
      this.lIIIIllIIi = own;
      this.IiliiIlIIi[this.liliiIlIIi]++;
      this.iiliiIlIIi++;
      if (this.iiliiIlIIi > 16) {
         this.IlIillIiilIi(IIlIilillIlIilil.lliliIIlil, own);
      }
   }

   public static boolean IIIilIIiiIIi(float gcd, float delta) {
      if (!(delta > 0.0F) || !Float.isFinite(delta)) {
         return true;
      } else if (!Float.isFinite(gcd)) {
         return false;
      } else {
         double var2 = (double)gcd / (double)delta;
         return Math.abs(var2 - Math.rint(var2)) <= 0.02F;
      }
   }

   public int Ililllililil() {
      long var6 = 830431797200936067L;
      long var8 = 356277705699758097L;
      var6 ^= (0L ^ var6) & -1L << 32;
      int[] var2 = this.llliiIlIIi;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;
      var8 ^= (0L ^ var8) & -1L << 32;

      while ((int)(var8 >>> 32) < (int)var6) {
         var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
         var6 ^= ((long)((int)(var6 >>> 32) + (int)var8) << 32 ^ var6) & -1L << 32;
         var8 += 4294967296L;
      }

      return (int)(var6 >>> 32);
   }

   public void lIiiIiIlilli() {
      this.IiiiiIlIIi = -1;
   }

   public void iIlIlllllill(llIIiiililIIiiil own, boolean kind, boolean screenOpen) {
      if (own != null && own.IliIlllilIi()) {
         if (this.IIiiiIlIIi > 0) {
            this.IlIillIiilIi(IIlIilillIlIilil.IllliIIlil, kind);
         }

         if (own == llIIiiililIIiiil.liIliIIiil && this.lIiiiIlIIi) {
            this.IlIillIiilIi(IIlIilillIlIilil.lllliIIlil, kind);
         }

         if (screenOpen) {
            this.IlIillIiilIi(IIlIilillIlIilil.ililiIIlil, kind);
         }

         this.IIiiiIlIIi++;
         if (own == llIIiiililIIiiil.IIlliIIiil || own == llIIiiililIIiiil.iiIliIIiil || own == llIIiiililIIiiil.lIlliIIiil) {
            this.lIiiiIlIIi = true;
         }

         if (own == llIIiiililIIiiil.lIlliIIiil) {
            if (this.iIIIIllIIi) {
               if (this.IlIIIllIIi) {
                  this.IlIillIiilIi(IIlIilillIlIilil.IliliIIlil, kind);
               }

               this.iIIIIllIIi = false;
            } else {
               this.llIIIllIIi = true;
               this.ilIIIllIIi = kind;
            }
         }
      }
   }

   public void IIlllIlliIll(boolean forwardHeld) {
      if (!forwardHeld) {
         this.IlIillIiilIi(IIlIilillIlIilil.IiiliIIlil, this.lIIIIllIIi);
      }
   }

   public String Iiilliiliiil() {
      long var6 = 2742264336596548399L;
      StringBuilder var1 = new StringBuilder(160);
      var1.append(IIlilIliiIli<"IIlilIliiIli","y6zDcGTg90B1i31nJc92NtbXqltOpqkjsqoYRjsIH+7P4A==">())
         .append(this.Ililllililil())
         .append(IIlilIliiIli<"IIlilIliiIli","6bOtc9pi9lNt08/nxXpIHI7o2y++ceL8DZb0C6ylwI1e">())
         .append(this.IIillIiliIil());
      IIlIilillIlIilil[] var2 = IIlIilillIlIilil.values();
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for (long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         IIlIilillIlIilil var5 = var2[(int)var9];
         var1.append(' ').append(var5.iiiliIIlil).append('=').append(this.llliiIlIIi[var5.ordinal()]);
      }

      return var1.toString();
   }

   public void iliIiiliiiii() {
      this.lliiiIlIIi = true;
      this.iliiiIlIIi = true;
   }

   public void IilliliilIIi(int own, boolean slot) {
      this.iIiiiIlIIi++;
      if (this.iIiiiIlIIi > 1) {
         this.IlIillIiilIi(IIlIilillIlIilil.IilliIIlil, slot);
      }

      if (this.IIiiiIlIIi > 0) {
         this.IlIillIiilIi(IIlIilillIlIilil.lilliIIlil, slot);
      }

      if (own == this.IiiiiIlIIi) {
         this.IlIillIiilIi(IIlIilillIlIilil.iilliIIlil, slot);
      }

      this.IiiiiIlIIi = own;
   }
}
