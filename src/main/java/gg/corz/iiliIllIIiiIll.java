package gg.corz;

public final class iiliIllIIiiIll {
   public static final float iliiiIlilIiiiiIlil = 16.0F;
   private final float[] iiIiIllilIIliIllil;
   float IiiiIllilliiiIllil;
   private final float[] iIiiIllilIliiIllil;
   public static final float illIIllilIilIIllil = 1.85F;
   public static final float lilIIlliliilIIllil = 0.05F;
   public static final float IIiIIllillIiIIllil = 0.6F;
   final float[] iIIiIllilIlIiIllil;
   public static final int IiIIIllilliIIIllil = 6;
   float IlIIlllilllIIlllil;
   static final float IIllIllillIllIllil = 55.0F;
   float lliiIllililiiIllil;
   private final float[] liliIlliliiliIllil;
   static final float llllIllililllIllil = 3.0F;
   private final float[] IIiiIllillIiiIllil;
   public static final float lIlIIlliliIlIIllil = 0.008333334F;
   public static final float iIIIIllilIlIIIllil = 1.0F;
   static final float ilIlIllilIiIlIllil = 3.0F;
   private final float[] illiIllilIiliIllil;
   static final float IlilIllilllilIllil = (float) (Math.PI * 2);
   final float[] llIiIllililIiIllil;
   public static final float lliIIllililiIIllil = 4.0F;
   static final float IlIlIllilllIlIllil = 0.2F;
   static final float iiiIIllilIIIlIllil = 0.1F;
   final float[] liilIlliliiilIllil;
   public static final float iiIIIllilIIlIIllil = 0.05F;
   static final float IillIllillillIllil = 2.0F;
   final float[] IIIiIllillIIiIllil;
   public static final float IllIIllillllIIllil = -0.45F;
   static final float lIilIlliliIilIllil = 4.0F;
   final float[] IiIiIllilliIiIllil;
   public static final float iIiIIllilIliIIllil = 0.06F;
   private final float[] IlliIllilllliIllil;
   private final float[] lIliIlliliIliIllil;
   float lIIIllliliIIIlllil;
   static final float lIIlIlliliIIlIllil = 10.0F;
   static final float IiiIIllilliiIIllil = 0.08F;
   public static final float IIIIIllillIIIIllil = 5.0F;
   static final float iillIllilIIilIllil = 1.0F;
   public static final float llIIIllililIIIllil = 2.0F;
   static final float liIlIlliliiIlIllil = 40.0F;
   public static final float liiiiIliliiiiiIlil = 1.1428572F;
   float iiiiIllilIIIIlllil;
   static final float iIllIllilIlllIllil = 0.35F;
   float ilIIlllilIiIIlllil;
   final float[] ililIllilIiilIllil = new float[14];
   public static final int IliiiIlillliiiIlil = 14;

   public void IIlllIlliIll(Illlllllllll in, IllIlIilllIlIi env) {
      long var6 = 9015516643228055385L;
      if (!in.iIlIlllllill()) {
         this.IIIllIIliIIl(new Illlllllllll(), env);
      } else {
         System.arraycopy(this.ililIllilIiilIllil, 0, this.llIiIllililIiIllil, 0, 14);
         System.arraycopy(this.IIIiIllillIIiIllil, 0, this.IiIiIllilliIiIllil, 0, 14);
         this.IiiiIllilliiiIllil = this.lliiIllililiiIllil;
         this.lIIIllliliIIIlllil = this.iiiiIllilIIIIlllil;
         this.ilIIlllilIiIIlllil = this.IlIIlllilllIIlllil;
         float var3 = Math.min(Illlllllilll(in.liiiIIllIl()), 2.0F);
         float var4 = 1.0F - (float)Math.exp(-0.050000004F);

         for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < 6; var8 += 4294967296L) {
            this.IlIIlllilllIIlllil = this.IlIIlllilllIIlllil + (var3 - this.IlIIlllilllIIlllil) * var4;
            this.iiiiIllilIIIIlllil = this.iiiiIllilIIIIlllil + 0.052359883F * (1.6F + 2.4F * Math.min(this.IlIIlllilllIIlllil, 1.0F));
            this.lliiIllililiiIllil += 0.008333334F;
            this.Ililllililil(in, env);
         }

         if (this.iiiiIllilIIIIlllil > 4096.0F) {
            float var5 = (float) (Math.PI * 2) * (float)Math.floor((double)(this.iiiiIllilIIIIlllil / (float) (Math.PI * 2)));
            this.iiiiIllilIIIIlllil -= var5;
            this.lIIIllliliIIIlllil -= var5;
         }

         if (this.lliiIllililiiIllil > 100000.0F) {
            this.lliiIllililiiIllil -= 100000.0F;
            this.IiiiIllilliiiIllil -= 100000.0F;
         }

         if (!this.Iiilliiliiil()) {
            this.IIIllIIliIIl(new Illlllllllll(), env);
         }
      }
   }

   private static float IIIilIIiiIIi(float v) {
      return Float.isFinite(v) ? v : 0.0F;
   }

   public float lIiiIiIlilli(int i) {
      return this.IIIiIllillIIiIllil[i];
   }

   public float iliIiiliiiii() {
      return this.IlIIlllilllIIlllil;
   }

   private static float Illlllllilll(float w) {
      return !Float.isFinite(w) ? 4.0F : Math.min(w, 4.0F);
   }

   public static float IliIlllilIi(int i) {
      return (float)i / 13.0F;
   }

   public float IilliliilIIi(int i) {
      return this.ililIllilIiilIllil[i];
   }

   private void IIillIiliIil(Illlllllllll in) {
      long var32 = 8911251427182515922L;
      float var2 = 2.0F;
      float var3 = Iilllilliill(in.IlIiiIIillIiiIIi);
      float var4 = Iilllilliill(in.ilIiiIIiIiIiiIIi);
      float var5 = Iilllilliill(in.liIiiIIiiiIiiIIi);
      float var6 = IlIillIiilIi(IIIilIIiiIIi(in.lIiiiIIiiIiiiIIi), -1.0F, 1.0F);
      float var7 = IlIillIiilIi(IIIilIIiiIIi(in.IIliiIIilIliiIIi), -1.0F, 1.0F);
      float var8 = IlIillIiilIi(IIIilIIiiIIi(in.iIliiIIiIlliiIIi), -1.0F, 1.0F);
      float var9 = IlIillIiilIi(IIIilIIiiIIi(in.llliiIIiilliiIIi), -4.0F, 4.0F);
      float var10 = IlIillIiilIi(IIIilIIiiIIi(in.IiliiIIililiiIIi), -4.0F, 4.0F);
      float var11 = IlIillIiilIi(IIIilIIiiIIi(in.iiliiIIiIIiiiIIi), -4.0F, 4.0F);

      for (long var34 = var32 ^ (0L ^ var32) & -1L << 32; (int)(var34 >>> 32) < 14; var34 += 4294967296L) {
         float var13 = IliIlllilIi((int)(var34 >>> 32));
         float var14 = 0.5714286F * (float)Math.cos((double)this.IIIiIllillIIiIllil[(int)(var34 >>> 32)]);
         float var15 = (float)Math.sin((double)this.ililIllilIiilIllil[(int)(var34 >>> 32)]);
         float var16 = var2 + var14 * var15;
         var2 += 2.0F * var14 * var15;
         float var17 = Math.max(var16, 0.0F) / 16.0F;
         float var18 = 0.27F + 0.88F * var13;
         float var19 = var6 * var17;
         float var20 = var5 + var19;
         float var21 = (float)Math.sqrt((double)(var3 * var3 + var4 * var4 + var20 * var20));
         float var22 = (10.0F * var21 + 0.2F) * var18;
         float var23 = var6 * var6 * var17 / 0.08F;
         float var24 = var7 + var9 + var22 * var3;
         float var25 = var8 + var10 + var22 * var4 + 0.1F + var23;
         float var26 = var11 + var22 * var20 + 3.0F * var18 * var19;
         float var27 = (float)Math.atan2((double)var25, (double)var24);
         float var28 = this.ililIllilIiilIllil[(int)(var34 >>> 32)];
         if ((double)(var27 - var28) > Math.PI) {
            var27 -= (float) (Math.PI * 2);
         } else if ((double)(var28 - var27) > Math.PI) {
            var27 += (float) (Math.PI * 2);
         }

         this.liliIlliliiliIllil[(int)(var34 >>> 32)] = IlIillIiilIi(var27, -0.45F, liiiIIllIl((int)(var34 >>> 32)));
         float var29 = (float)Math.sqrt((double)(var24 * var24 + var25 * var25));
         float var30 = iIlIlllllill((int)(var34 >>> 32));
         this.IIiiIllillIiiIllil[(int)(var34 >>> 32)] = IlIillIiilIi(
            (float)Math.atan2((double)var26, (double)Math.max(var29, 0.25F)) * (0.25F + 0.75F * var13), -var30, var30
         );
         float var31 = IlIillIiilIi((float)Math.sqrt((double)(var29 * var29 + var26 * var26)), 0.35F, 3.0F);
         this.iIiiIllilIliiIllil[(int)(var34 >>> 32)] = 40.0F * var31 * (1.5F - 0.6F * var13);
      }
   }

   public void IlIlllIlilIl() {
      long var2 = -8416303263068677468L;

      for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < 14; var4 += 4294967296L) {
         this.ililIllilIiilIllil[(int)(var4 >>> 32)] = 0.0F;
         this.IIIiIllillIIiIllil[(int)(var4 >>> 32)] = 0.0F;
         this.liilIlliliiilIllil[(int)(var4 >>> 32)] = 0.0F;
         this.iIIiIllilIlIiIllil[(int)(var4 >>> 32)] = 0.0F;
      }

      this.IlIIlllilllIIlllil = 0.0F;
      this.IiIlliIliiIl();
   }

   public void IIIllIIliIIl(Illlllllllll in, IllIlIilllIlIi env) {
      long var5 = -4254879792587710792L;
      Illlllllllll var3 = in.iIlIlllllill() ? in : new Illlllllllll();
      this.IIillIiliIil(var3);

      for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 14; var7 += 4294967296L) {
         this.ililIllilIiilIllil[(int)(var7 >>> 32)] = this.liliIlliliiliIllil[(int)(var7 >>> 32)];
         this.IIIiIllillIIiIllil[(int)(var7 >>> 32)] = this.IIiiIllillIiiIllil[(int)(var7 >>> 32)];
         this.liilIlliliiilIllil[(int)(var7 >>> 32)] = 0.0F;
         this.iIIiIllilIlIiIllil[(int)(var7 >>> 32)] = 0.0F;
      }

      lIIIIilliIIIIill.iIlIlllllill(this.ililIllilIiilIllil, this.IIIiIllillIIiIllil, env);
      this.IlIIlllilllIIlllil = Math.min(Illlllllilll(var3.liiiIIllIl()), 2.0F);
      this.IiIlliIliiIl();
   }

   public static float liiiIIllIl(int i) {
      float var1 = IliIlllilIi(i);
      return 1.2F + 0.55F * var1 * (float)Math.sqrt((double)var1);
   }

   private boolean Iiilliiliiil() {
      long var2 = -6118449969982161323L;
      if (Float.isFinite(this.lliiIllililiiIllil) && Float.isFinite(this.iiiiIllilIIIIlllil) && Float.isFinite(this.IlIIlllilllIIlllil)) {
         for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < 14; var4 += 4294967296L) {
            if (!Float.isFinite(this.ililIllilIiilIllil[(int)(var4 >>> 32)])
               || !Float.isFinite(this.IIIiIllillIIiIllil[(int)(var4 >>> 32)])
               || !Float.isFinite(this.liilIlliliiilIllil[(int)(var4 >>> 32)])
               || !Float.isFinite(this.iIIiIllilIlIiIllil[(int)(var4 >>> 32)])) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void IiIlliIliiIl() {
      System.arraycopy(this.ililIllilIiilIllil, 0, this.llIiIllililIiIllil, 0, 14);
      System.arraycopy(this.IIIiIllillIIiIllil, 0, this.IiIiIllilliIiIllil, 0, 14);
      this.IiiiIllilliiiIllil = this.lliiIllililiiIllil;
      this.lIIIllliliIIIlllil = this.iiiiIllilIIIIlllil;
      this.ilIIlllilIiIIlllil = this.IlIIlllilllIIlllil;
   }

   public iiliIllIIiiIll() {
      this.liilIlliliiilIllil = new float[14];
      this.IIIiIllillIIiIllil = new float[14];
      this.iIIiIllilIlIiIllil = new float[14];
      this.llIiIllililIiIllil = new float[14];
      this.IiIiIllilliIiIllil = new float[14];
      this.iiIiIllilIIliIllil = new float[14];
      this.lIliIlliliIliIllil = new float[14];
      this.IlliIllilllliIllil = new float[14];
      this.illiIllilIiliIllil = new float[14];
      this.liliIlliliiliIllil = new float[14];
      this.IIiiIllillIiiIllil = new float[14];
      this.iIiiIllilIliiIllil = new float[14];
      IllIlIilllIlIi var1 = new IllIlIilllIlIi();
      IllIlIilllIlIi.IlIlllIlilIl(var1);
      this.IIIllIIliIIl(new Illlllllllll(), var1);
   }

   static float IlIillIiilIi(float v, float lo, float hi) {
      return v < lo ? lo : (v > hi ? hi : v);
   }

   public static float iIlIlllllill(int i) {
      return 0.08F + 0.42F * IliIlllilIi(i);
   }

   private static float Iilllilliill(float v) {
      return !Float.isFinite(v) ? 0.0F : Math.max(-4.0F, Math.min(4.0F, v));
   }

   private void Ililllililil(Illlllllllll in, IllIlIilllIlIi env) {
      long var11 = -6619757577858484654L;
      this.IIillIiliIil(in);

      for (var11 ^= (0L ^ var11) & -1L << 32; (int)(var11 >>> 32) < 14; var11 += 4294967296L) {
         float var4 = IliIlllilIi((int)(var11 >>> 32));
         float var5 = this.iIiiIllilIliiIllil[(int)(var11 >>> 32)];
         float var6 = 2.0F * (0.62F - 0.22F * var4) * (float)Math.sqrt((double)var5);
         float var7 = (int)(var11 >>> 32) == 0 ? 0.05F : this.ililIllilIiilIllil[(int)(var11 >>> 32) - 1];
         float var8 = 55.0F * (var7 - this.ililIllilIiilIllil[(int)(var11 >>> 32)]);
         float var9 = (int)(var11 >>> 32) == 0 ? 0.0F : this.IIIiIllillIIiIllil[(int)(var11 >>> 32) - 1];
         float var10 = 55.0F * (var9 - this.IIIiIllillIIiIllil[(int)(var11 >>> 32)]);
         if ((int)(var11 >>> 32) < 13) {
            var8 += 55.0F * (this.ililIllilIiilIllil[(int)(var11 >>> 32) + 1] - this.ililIllilIiilIllil[(int)(var11 >>> 32)]);
            var10 += 55.0F * (this.IIIiIllillIIiIllil[(int)(var11 >>> 32) + 1] - this.IIIiIllillIIiIllil[(int)(var11 >>> 32)]);
         }

         this.iiIiIllilIIliIllil[(int)(var11 >>> 32)] = var5 * (this.liliIlliliiliIllil[(int)(var11 >>> 32)] - this.ililIllilIiilIllil[(int)(var11 >>> 32)])
            + var8
            - var6 * this.liilIlliliiilIllil[(int)(var11 >>> 32)];
         this.lIliIlliliIliIllil[(int)(var11 >>> 32)] = var5 * (this.IIiiIllillIiiIllil[(int)(var11 >>> 32)] - this.IIIiIllillIIiIllil[(int)(var11 >>> 32)])
            + var10
            - var6 * this.iIIiIllilIlIiIllil[(int)(var11 >>> 32)];
      }

      for (var11 ^= (0L ^ var11) & -1L << 32; (int)(var11 >>> 32) < 14; var11 += 4294967296L) {
         this.liilIlliliiilIllil[(int)(var11 >>> 32)] = this.liilIlliliiilIllil[(int)(var11 >>> 32)]
            + this.iiIiIllilIIliIllil[(int)(var11 >>> 32)] * 0.008333334F;
         this.iIIiIllilIlIiIllil[(int)(var11 >>> 32)] = this.iIIiIllilIlIiIllil[(int)(var11 >>> 32)]
            + this.lIliIlliliIliIllil[(int)(var11 >>> 32)] * 0.008333334F;
         this.ililIllilIiilIllil[(int)(var11 >>> 32)] = this.ililIllilIiilIllil[(int)(var11 >>> 32)]
            + this.liilIlliliiilIllil[(int)(var11 >>> 32)] * 0.008333334F;
         this.IIIiIllillIIiIllil[(int)(var11 >>> 32)] = this.IIIiIllillIIiIllil[(int)(var11 >>> 32)]
            + this.iIIiIllilIlIiIllil[(int)(var11 >>> 32)] * 0.008333334F;
         this.IlliIllilllliIllil[(int)(var11 >>> 32)] = this.ililIllilIiilIllil[(int)(var11 >>> 32)];
         this.illiIllilIiliIllil[(int)(var11 >>> 32)] = this.IIIiIllillIIiIllil[(int)(var11 >>> 32)];
      }

      lIIIIilliIIIIill.iIlIlllllill(this.ililIllilIiilIllil, this.IIIiIllillIIiIllil, env);

      for (long var17 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var17 >>> 32) < 14; var17 += 4294967296L) {
         float var13 = this.ililIllilIiilIllil[(int)(var17 >>> 32)] - this.IlliIllilllliIllil[(int)(var17 >>> 32)];
         if (var13 > 0.0F && this.liilIlliliiilIllil[(int)(var17 >>> 32)] < 0.0F) {
            this.liilIlliliiilIllil[(int)(var17 >>> 32)] = 0.0F;
         } else if (var13 < 0.0F && this.liilIlliliiilIllil[(int)(var17 >>> 32)] > 0.0F) {
            this.liilIlliliiilIllil[(int)(var17 >>> 32)] = 0.0F;
         }

         float var14 = this.IIIiIllillIIiIllil[(int)(var17 >>> 32)] - this.illiIllilIiliIllil[(int)(var17 >>> 32)];
         if (var14 > 0.0F && this.iIIiIllilIlIiIllil[(int)(var17 >>> 32)] < 0.0F) {
            this.iIIiIllilIlIiIllil[(int)(var17 >>> 32)] = 0.0F;
         } else if (var14 < 0.0F && this.iIIiIllilIlIiIllil[(int)(var17 >>> 32)] > 0.0F) {
            this.iIIiIllilIlIiIllil[(int)(var17 >>> 32)] = 0.0F;
         }
      }
   }
}
