package gg.corz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_2246;
import net.minecraft.class_2350;
import net.minecraft.class_2389;
import net.minecraft.class_2397;
import net.minecraft.class_2465;
import net.minecraft.class_2482;
import net.minecraft.class_2488;
import net.minecraft.class_2510;
import net.minecraft.class_2533;
import net.minecraft.class_2680;
import net.minecraft.class_2760;
import net.minecraft.class_2771;
import net.minecraft.class_3749;
import net.minecraft.class_3922;
import net.minecraft.class_5544;
import net.minecraft.class_2350.class_2351;

final class iililIilIIiilIil {
   final Map<Long, class_2680> iiiIIllIil = new HashMap<>();
   static final int lIlIIllIil = 7;
   static final int iIlIIllIil = -1;
   final List<IillliIilillliIi> IIIlIllIil = new ArrayList<>();
   final List<float[]> IiIlIllIil;
   static final int lilIIllIil = 4;
   static final int IllIIllIil = 12;
   static final int iiIIIllIil = -10;
   static final int iIiIIllIil = 2;
   static final int lIiIIllIil = 5;
   static final float[] liiIIllIil = new float[]{-0.5F, 7.0F, 5.2F};
   static final float[] lliIIllIil = new float[]{-3.5F, 0.0F, 5.35F, 20.0F};
   static final float[] IiiIIllIil = new float[]{5.5F, 5.3F, 2.5F};
   static final int iilIIllIil = -9;
   final List<float[]> IlIlIllIil;
   static final int illIIllIil = 2;
   final List<float[]> liIlIllIil;
   static final int IIlIIllIil = 9;
   static final int IilIIllIil = 1;
   final List<float[]> iIIlIllIil;
   static final int lllIIllIil = -3;
   static final int IIiIIllIil = -6;
   final List<float[]> ilIlIllIil;
   final List<liIliiliiIliil> lIIlIllIil = new ArrayList<>();
   final List<float[]> llIlIllIil;
   static final float[] iliIIllIil = new float[]{3.5F, 0.0F, 5.35F, -20.0F};
   static final float[] IliIIllIil = new float[]{-7.0F, 1.5F, 0.55F};
   final List<float[]> iiIlIllIil;

   private void IIlilIliiIli() {
      long var5 = -6037722520598410479L;
      class_2680 var1 = class_2246.field_10491.method_9564();
      this.IlIlllIlilIl(-17, -1, -16, 16, -1, -2, var1);
      var5 ^= (-73014444032L ^ var5) & -1L << 32;

      while ((int)(var5 >>> 32) <= 16) {
         for (var5 ^= (-16L ^ var5) & -1L >>> 32; (int)var5 <= -2; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
            float var4 = (float)(
               Math.sin((double)((int)(var5 >>> 32)) * 0.55 + (double)((int)var5) * 0.3)
                  + Math.sin((double)((int)(var5 >>> 32)) * 0.21 - (double)((int)var5) * 0.47)
            );
            if (var4 > 0.9F) {
               this.IIIllIIliIIl(
                  (int)(var5 >>> 32), 0, (int)var5, (class_2680)class_2246.field_10477.method_9564().method_11657(class_2488.field_11518, var4 > 1.4F ? 4 : 2)
               );
            }
         }

         var5 += 4294967296L;
      }

      this.Illillliilli(-7, -7, 5);
      this.Illillliilli(5, -9, 6);
      this.Illillliilli(-1, -14, 7);
      this.Illillliilli(10, -6, 4);
      this.Illillliilli(-12, -11, 6);
      this.Illillliilli(1, -6, 3);
   }

   private void IlIlllIlilIl(int y0, int z1, int x0, int z0, int s, int y1, class_2680 x1) {
      long var11 = 1796439526908505356L;
      long var13 = -2239749016852879424L;
      var11 ^= ((long)Math.min(y0, z0) << 32 ^ var11) & -1L << 32;

      while ((int)(var11 >>> 32) <= Math.max(y0, z0)) {
         for (var11 ^= ((long)Math.min(z1, s) ^ var11) & -1L >>> 32; (int)var11 <= Math.max(z1, s); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            for (var13 ^= ((long)Math.min(x0, y1) << 32 ^ var13) & -1L << 32; (int)(var13 >>> 32) <= Math.max(x0, y1); var13 += 4294967296L) {
               this.IIIllIIliIIl((int)(var11 >>> 32), (int)var11, (int)(var13 >>> 32), x1);
            }
         }

         var11 += 4294967296L;
      }
   }

   static boolean IIiilIiiiIii(float z) {
      return z < -1.0F;
   }

   private void Iiilliiliiil(int x, int z) {
      class_2680 var3 = (class_2680)class_2246.field_10569.method_9564().method_11657(class_2510.field_11571, class_2350.field_11043);
      this.IIIllIIliIIl(x, 0, z, var3);
      this.IIIllIIliIIl(
         x - 1,
         0,
         z,
         (class_2680)((class_2680)class_2246.field_10323.method_9564().method_11657(class_2533.field_11631, true))
            .method_11657(class_2533.field_11177, class_2350.field_11039)
      );
      this.IIIllIIliIIl(
         x + 1,
         0,
         z,
         (class_2680)((class_2680)class_2246.field_10323.method_9564().method_11657(class_2533.field_11631, true))
            .method_11657(class_2533.field_11177, class_2350.field_11034)
      );
   }

   private void Iilllilliill() {
      long var6 = -7277423802316804597L;
      class_2680 var1 = class_2246.field_10104.method_9564();
      this.IlIlllIlilIl(-9, 0, -1, -6, 6, -1, var1);
      this.IlIlllIlilIl(-9, 0, 0, -6, 6, 0, var1);
      this.IlIlllIlilIl(-8, 0, 0, -7, 0, 0, class_2246.field_10056.method_9564());
      this.IlIlllIlilIl(-8, 1, 0, -7, 2, 0, null);
      class_2680 var2 = (class_2680)((class_2680)class_2246.field_17350.method_9564().method_11657(class_3922.field_17352, true))
         .method_11657(class_3922.field_17564, class_2350.field_11035);
      this.IIIllIIliIIl(-8, 1, 0, var2);
      this.IIIllIIliIIl(-7, 1, 0, var2);
      this.IlIlllIlilIl(-9, -1, 0, -6, -1, 1, class_2246.field_10056.method_9564());
      class_2680 var3 = (class_2680)((class_2680)((class_2680)class_2246.field_10323.method_9564().method_11657(class_2533.field_11625, class_2760.field_12619))
            .method_11657(class_2533.field_11631, false))
         .method_11657(class_2533.field_11177, class_2350.field_11035);
      this.IlIlllIlilIl(-9, 3, 1, -6, 3, 1, var3);
      float var4 = 4.0F;
      this.IIIlIllIil
         .add(
            new IillliIilillliIi(
               (class_2680)((class_2680)class_2246.field_27140.method_9564().method_11657(class_5544.field_27174, 3))
                  .method_11657(class_5544.field_27175, true),
               -9.0F,
               var4,
               1.0F
            )
         );
      this.ilIlIllIil.add(new float[]{-8.5F, var4 + 0.45F, 1.5F});
      this.IIIlIllIil.add(new IillliIilillliIi(class_2246.field_10192.method_9564(), -8.0F, var4, 1.0F));
      this.IIIlIllIil
         .add(
            new IillliIilillliIi(
               (class_2680)((class_2680)class_2246.field_27100.method_9564().method_11657(class_5544.field_27174, 2))
                  .method_11657(class_5544.field_27175, true),
               -7.0F,
               var4,
               1.0F
            )
         );
      this.ilIlIllIil.add(new float[]{-6.5F, var4 + 0.42F, 1.5F});
      this.IIIlIllIil.add(new IillliIilillliIi(class_2246.field_16541.method_9564(), -6.0F, var4, 1.0F));
      this.IiIlIllIil.add(new float[]{-5.5F, var4 + 0.3F, 1.5F});

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < 4; var8 += 4294967296L) {
         this.llIlIllIil.add(new float[]{-8.5F + (float)((int)(var8 >>> 32)), 3.78F, 2.03F, ((int)(var8 >>> 32) % 2 == 0 ? 1.0F : -1.0F) * 0.06F});
      }
   }

   boolean iliIiiliiiii(int z, int x, int y) {
      class_2680 var4 = this.iiiIIllIil.get(IliIlllilIi(z, x, y));
      return var4 != null && var4.method_26216();
   }

   private void Illillliilli(int height, int z, int x) {
      long var17 = -5659670537969330320L;
      long var13 = 3398387199268218287L;
      long var15 = -6910040190223207514L;
      class_2680 var4 = class_2246.field_10037.method_9564();
      class_2680 var5 = (class_2680)class_2246.field_9988.method_9564().method_11657(class_2397.field_11200, true);
      class_2680 var6 = (class_2680)class_2246.field_10477.method_9564().method_11657(class_2488.field_11518, 1);

      for (var13 ^= (0L ^ var13) & -1L << 32; (int)(var13 >>> 32) < x - 1; var13 += 4294967296L) {
         this.IIIllIIliIIl(height, (int)(var13 >>> 32), z, var4);
      }

      var13 ^= (4294967296L ^ var13) & -1L << 32;

      while ((int)(var13 >>> 32) <= x) {
         var13 ^= ((long)(x - (int)(var13 >>> 32)) ^ var13) & -1L >>> 32;
         float var9 = (int)var13 == 0 ? 0.0F : ((int)var13 % 2 == 1 ? 1.0F : 1.8F) * Math.min(1.0F, 0.55F + (float)((int)var13) * 0.18F);
         var15 ^= ((long)((int)Math.ceil((double)var9)) << 32 ^ var15) & -1L << 32;

         for (var15 ^= ((long)(-((int)(var15 >>> 32))) ^ var15) & -1L >>> 32;
            (int)var15 <= (int)(var15 >>> 32);
            var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32
         ) {
            for (var17 ^= ((long)(-((int)(var15 >>> 32))) << 32 ^ var17) & -1L << 32; (int)(var17 >>> 32) <= (int)(var15 >>> 32); var17 += 4294967296L) {
               if (!((float)((int)var15 * (int)var15 + (int)(var17 >>> 32) * (int)(var17 >>> 32)) > var9 * var9 + 0.01F)
                  && ((int)(var13 >>> 32) >= x - 1 || (int)var15 != 0 || (int)(var17 >>> 32) != 0)) {
                  this.IIIllIIliIIl(height + (int)var15, (int)(var13 >>> 32), z + (int)(var17 >>> 32), var5);
               }
            }
         }

         var13 += 4294967296L;
      }

      var13 ^= (-8589934592L ^ var13) & -1L << 32;

      while ((int)(var13 >>> 32) <= 2) {
         for (var13 ^= (-2L ^ var13) & -1L >>> 32; (int)var13 <= 2; var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
            for (var17 ^= ((long)x ^ var17) & -1L >>> 32; (int)var17 >= 1; var17 ^= (var17 ^ var17 + (long)-1) & -1L >>> 32) {
               class_2680 var10 = this.lIiiIiIlilli(height + (int)(var13 >>> 32), (int)var17, z + (int)var13);
               if (var10 != null && var10.method_26204() == class_2246.field_9988) {
                  if (this.lIiiIiIlilli(height + (int)(var13 >>> 32), (int)var17 + 1, z + (int)var13) == null) {
                     this.IIIllIIliIIl(height + (int)(var13 >>> 32), (int)var17 + 1, z + (int)var13, var6);
                  }
                  break;
               }
            }
         }

         var13 += 4294967296L;
      }
   }

   class_2680 lIiiIiIlilli(int z, int x, int y) {
      return this.iiiIIllIil.get(IliIlllilIi(z, x, y));
   }

   private void IIillIiliIil() {
      long var8 = -1963399724871167968L;
      long var10 = 4090531282544177693L;
      class_2680 var1 = class_2246.field_10504.method_9564();
      this.IlIlllIlilIl(-5, 0, 0, -4, 2, 0, var1);
      this.IIIlIllIil.add(new IillliIilillliIi(class_2246.field_16541.method_9564(), -5.0F, 3.0F, 0.0F));
      this.IiIlIllIil.add(new float[]{-4.5F, 3.3F, 0.5F});
      this.IIIlIllIil.add(new IillliIilillliIi(class_2246.field_10151.method_9564(), -4.0F, 3.0F, 0.0F));
      this.Iiilliiliiil((int)Math.floor((double)lliIIllIil[0]), (int)Math.floor((double)lliIIllIil[2]));
      this.Iiilliiliiil((int)Math.floor((double)iliIIllIil[0]), (int)Math.floor((double)iliIIllIil[2]));
      this.IIIilIIiiIIi();
      class_2680 var2 = (class_2680)class_2246.field_23985.method_9564().method_11657(class_2465.field_11459, class_2351.field_11052);
      class_2680 var3 = (class_2680)class_2246.field_16541.method_9564().method_11657(class_3749.field_16545, true);
      int[] var4 = new int[]{-3, 2};
      var8 ^= ((long)var4.length << 32 ^ var8) & -1L << 32;

      for (long var13 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
         var10 ^= ((long)var4[(int)var13] << 32 ^ var10) & -1L << 32;
         this.IIIllIIliIIl((int)(var10 >>> 32), 6, 4, var2);
         this.IIIllIIliIIl((int)(var10 >>> 32), 5, 4, var3);
         this.IiIlIllIil.add(new float[]{(float)((int)(var10 >>> 32)) + 0.5F, 5.3F, 4.5F});
      }

      this.Ililllililil(-8.8F, 8.8F, 6.0F, 3.08F);
   }

   static float[][] IiIiliIiiiIi() {
      return new float[][]{
         {5.5F, 5.6F, 0.8F, 14.0F},
         {7.45F, 5.0F, 0.9F, -22.0F},
         {5.55F, 6.6F, 0.75F, 33.0F},
         {7.2F, 6.5F, 0.85F, 8.0F},
         {6.1F, 7.4F, 0.8F, -40.0F},
         {4.9F, 7.1F, 0.75F, 52.0F},
         {4.8F, 6.1F, 0.7F, 21.0F},
         {7.0F, 7.3F, 0.8F, -5.0F},
         {6.15F, 5.15F, 0.75F, -33.0F}
      };
   }

   static int liiiIIllIl(long k) {
      return (int)(k >>> 40 & 1048575L) - 512;
   }

   iililIilIIiilIil() {
      this.iIIlIllIil = new ArrayList<>();
      this.IlIlIllIil = new ArrayList<>();
      this.llIlIllIil = new ArrayList<>();
      this.ilIlIllIil = new ArrayList<>();
      this.IiIlIllIil = new ArrayList<>();
      this.liIlIllIil = new ArrayList<>();
      this.iiIlIllIil = new ArrayList<>();
   }

   private void IlIillIiilIi() {
      long var16 = 5732301604529563471L;
      long var18 = -3808371305651426233L;
      long var20 = -2410517234459386138L;
      long var14 = -1175957924857676508L;
      class_2680 var1 = class_2246.field_10037.method_9564();
      class_2680 var2 = (class_2680)class_2246.field_9988.method_9564().method_11657(class_2397.field_11200, true);
      this.IIIllIIliIIl(5, 0, 2, var1);
      this.IIIllIIliIIl(5, 1, 2, var1);
      float[] var3 = new float[]{0.0F, 2.3F, 1.9F, 1.35F, 0.7F};
      var14 ^= (4294967296L ^ var14) & -1L << 32;

      while ((int)(var14 >>> 32) <= 4) {
         float var5 = var3[(int)(var14 >>> 32)];
         var14 ^= ((long)((int)Math.ceil((double)var5)) ^ var14) & -1L >>> 32;
         var16 ^= ((long)(-((int)var14)) << 32 ^ var16) & -1L << 32;

         while ((int)(var16 >>> 32) <= (int)var14) {
            for (var16 ^= ((long)(-((int)var14)) ^ var16) & -1L >>> 32; (int)var16 <= (int)var14; var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
               if (!((float)((int)(var16 >>> 32) * (int)(var16 >>> 32) + (int)var16 * (int)var16) > var5 * var5 + 0.01F)
                  && ((int)(var14 >>> 32) != 1 || (int)(var16 >>> 32) != 0 || (int)var16 != 0)) {
                  this.IIIllIIliIIl(5 + (int)(var16 >>> 32), (int)(var14 >>> 32), 2 + (int)var16, var2);
               }
            }

            var16 += 4294967296L;
         }

         var14 += 4294967296L;
      }

      int[] var4 = new int[]{-45747, -15811, -11688193, -12723068, -34087, -3626};
      var18 ^= (0L ^ var18) & -1L << 32;

      for (long var24 = var14 ^ (0L ^ var14) & -1L >>> 32; (int)var24 < 4; var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
         float var7 = 1.35F + (float)((int)var24) * 0.92F;
         float var8 = Math.max(0.5F, 2.4F - (float)((int)var24) * 0.55F);
         var18 ^= ((long)(7 - (int)var24) ^ var18) & -1L >>> 32;

         for (var20 ^= (0L ^ var20) & -1L << 32; (int)(var20 >>> 32) < (int)var18; var20 += 4294967296L) {
            float var11 = (float)(Math.PI * (0.08 + 0.84 * (double)((float)((int)(var20 >>> 32)) + 0.5F * (float)((int)var24 & 1)) / (double)((int)var18)));
            float var12 = 5.5F - (float)Math.cos((double)var11) * var8;
            float var13 = 2.5F + (float)Math.sin((double)var11) * var8;
            List var10000 = this.iIIlIllIil;
            float[] var10001 = new float[]{
               var12, var7 + 0.18F * (float)Math.sin((double)((float)((int)(var20 >>> 32)) * 2.1F + (float)((int)var24))), var13, 0.0F
            };
            int var10005 = (int)(var18 >>> 32);
            var18 += 4294967296L;
            var10001[3] = (float)var4[var10005 % var4.length];
            var10000.add(var10001);
         }
      }

      float[][] var6 = new float[][]{{3.8F, 2.9F, 0.9F, 18.0F}, {5.0F, 3.25F, 0.75F, -12.0F}, {6.4F, 2.8F, 1.0F, 28.0F}, {4.4F, 2.2F, 0.7F, 40.0F}};

      for (long var26 = var16 ^ (0L ^ var16) & -1L << 32; (int)(var26 >>> 32) < var6.length; var26 += 4294967296L) {
         this.IlIlIllIil
            .add(
               new float[]{
                  var6[(int)(var26 >>> 32)][0],
                  0.0F,
                  var6[(int)(var26 >>> 32)][1],
                  var6[(int)(var26 >>> 32)][2],
                  var6[(int)(var26 >>> 32)][3],
                  (float)((int)(var26 >>> 32) % 4)
               }
            );
      }
   }

   private void IIlllIlliIll() {
      long var12 = 5506380342340574838L;
      long var14 = 3913264595367402545L;
      class_2680 var1 = class_2246.field_9975.method_9564();
      class_2680 var2 = (class_2680)class_2246.field_10037.method_9564().method_11657(class_2465.field_11459, class_2351.field_11048);
      class_2680 var3 = (class_2680)class_2246.field_10037.method_9564().method_11657(class_2465.field_11459, class_2351.field_11051);
      class_2680 var4 = (class_2680)class_2246.field_10436.method_9564().method_11657(class_2465.field_11459, class_2351.field_11052);
      class_2680 var5 = (class_2680)class_2246.field_10436.method_9564().method_11657(class_2465.field_11459, class_2351.field_11048);
      class_2680 var6 = (class_2680)class_2246.field_10436.method_9564().method_11657(class_2465.field_11459, class_2351.field_11051);
      class_2680 var7 = (class_2680)class_2246.field_10010.method_9564().method_11657(class_2465.field_11459, class_2351.field_11048);
      this.IlIlllIlilIl(-10, -1, -1, 9, -1, 12, var1);
      this.IlIlllIlilIl(-10, 7, -1, 9, 7, 12, var1);
      this.IlIlllIlilIl(-9, 1, -1, 8, 6, -1, var2);
      this.IlIlllIlilIl(-9, 0, -1, 8, 0, -1, var5);
      this.IlIlllIlilIl(-10, 1, 0, -10, 6, 12, var3);
      this.IlIlllIlilIl(9, 1, 0, 9, 6, 12, var3);
      this.IlIlllIlilIl(-10, 0, 0, -10, 0, 12, var6);
      this.IlIlllIlilIl(9, 0, 0, 9, 0, 12, var6);
      this.IlIlllIlilIl(-10, 0, -1, -10, 6, -1, var4);
      this.IlIlllIlilIl(9, 0, -1, 9, 6, -1, var4);
      int[] var8 = new int[]{2, 5, 8};
      var12 ^= ((long)var8.length << 32 ^ var12) & -1L << 32;

      for (long var17 = var12 ^ (0L ^ var12) & -1L >>> 32; (int)var17 < (int)(var17 >>> 32); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
         var14 ^= ((long)var8[(int)var17] << 32 ^ var14) & -1L << 32;
         this.IlIlllIlilIl(-9, 6, (int)(var14 >>> 32), 8, 6, (int)(var14 >>> 32), var7);
      }
   }

   private void Iilililiiili() {
      this.lIIlIllIil.add(new liIliiliiIliil(IliIIllIil[0], IliIIllIil[1], IliIIllIil[2], 1.0F, 0.55F, 0.22F, 4.2F, 4.2F, true));

      for (float[] var2 : this.IiIlIllIil) {
         this.lIIlIllIil.add(new liIliiliiIliil(var2[0], var2[1], var2[2], 1.0F, 0.74F, 0.42F, 0.95F, 2.3F, false));
      }

      for (float[] var4 : this.ilIlIllIil) {
         this.lIIlIllIil.add(new liIliiliiIliil(var4[0], var4[1], var4[2], 1.0F, 0.7F, 0.38F, 0.55F, 1.4F, false));
      }

      this.lIIlIllIil.add(new liIliiliiIliil(5.5F, 3.0F, 4.2F, 0.9F, 0.72F, 0.62F, 0.75F, 2.6F, false));
      this.lIIlIllIil.add(new liIliiliiIliil(-0.5F, 2.6F, -0.4F, 0.42F, 0.55F, 0.9F, 0.7F, 3.4F, false));
   }

   static long IliIlllilIi(int z, int y, int x) {
      return (long)(z + 512) << 40 | (long)(y + 512) << 20 | (long)(x + 512);
   }

   private void Ililllililil(float x1, float x0, float z, float y) {
      long var16 = -4647525298750937575L;
      long var18 = 3539968384211183740L;
      var16 ^= (21474836480L ^ var16) & -1L << 32;
      float var6 = (x0 - x1) / (float)((int)(var16 >>> 32));
      int[] var7 = new int[]{-45747, -15811, -12723068, -11688193, -3626};
      var16 ^= (0L ^ var16) & -1L >>> 32;
      var18 ^= (0L ^ var18) & -1L << 32;

      while ((int)(var18 >>> 32) < (int)(var16 >>> 32)) {
         float var10 = x1 + (float)((int)(var18 >>> 32)) * var6;

         for (var18 ^= (0L ^ var18) & -1L >>> 32; (int)var18 <= 24; var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
            float var12 = (float)((int)var18) / 24.0F;
            float var13 = var10 + var6 * var12;
            float var14 = 2.2F * var12 * (1.0F - var12);
            float var15 = (float)Math.sin((double)(var13 * 7.3F)) * 0.04F;
            this.liIlIllIil
               .add(
                  new float[]{
                     var13, z - var14 + var15, y + (float)Math.cos((double)(var13 * 5.1F)) * 0.05F, 0.075F + 0.02F * (float)Math.sin((double)(var13 * 3.7F))
                  }
               );
            if ((int)var18 % 4 == 2) {
               float[] var10001 = new float[]{var13, z - var14 - 0.12F, y + 0.06F, 0.0F};
               int var10005 = (int)var16;
               var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32;
               var10001[3] = (float)var7[var10005 % var7.length];
               this.iiIlIllIil.add(var10001);
            }
         }

         this.liIlIllIil.add(new float[]{var10, z - 0.02F, y + 0.04F, -0.11F});
         var18 += 4294967296L;
      }

      this.liIlIllIil.add(new float[]{x0, z - 0.02F, y + 0.04F, -0.11F});
   }

   private void Illlllllilll() {
      long var7 = -8556056062769263968L;
      class_2680 var1 = (class_2680)((class_2680)class_2246.field_10285.method_9564().method_11657(class_2389.field_10907, true))
         .method_11657(class_2389.field_10903, true);
      class_2680 var2 = (class_2680)class_2246.field_10436.method_9564().method_11657(class_2465.field_11459, class_2351.field_11052);
      class_2680 var3 = (class_2680)class_2246.field_10436.method_9564().method_11657(class_2465.field_11459, class_2351.field_11048);
      this.IlIlllIlilIl(-3, 1, -1, 2, 4, -1, var1);
      this.IlIlllIlilIl(-4, 1, -1, -4, 4, -1, var2);
      this.IlIlllIlilIl(3, 1, -1, 3, 4, -1, var2);
      this.IlIlllIlilIl(-4, 5, -1, 3, 5, -1, var3);
      class_2680 var4 = (class_2680)class_2246.field_10071.method_9564().method_11657(class_2482.field_11501, class_2771.field_12679);
      this.IlIlllIlilIl(-3, 0, 0, 2, 0, 0, var4);
      class_2680 var5 = class_2246.field_10536.method_9564();

      for (long var9 = var7 ^ (-12884901888L ^ var7) & -1L << 32; (int)(var9 >>> 32) <= 2; var9 += 4294967296L) {
         this.IIIllIIliIIl((int)(var9 >>> 32), 1, 0, ((int)(var9 >>> 32) & 1) == 0 ? var5 : class_2246.field_10466.method_9564());
      }
   }

   static iililIilIIiilIil IiIlliIliiIl() {
      iililIilIIiilIil var0 = new iililIilIIiilIil();
      var0.IIlllIlliIll();
      var0.Illlllllilll();
      var0.Iilllilliill();
      var0.IIillIiliIil();
      var0.IlIillIiilIi();
      var0.IIlilIliiIli();
      var0.Iilililiiili();
      return var0;
   }

   private void IIIllIIliIIl(int x, int y, int z, class_2680 s) {
      if (s == null) {
         this.iiiIIllIil.remove(IliIlllilIi(x, y, z));
      } else {
         this.iiiIIllIil.put(IliIlllilIi(x, y, z), s);
      }
   }

   private void IIIilIIiiIIi() {
      long var6 = -3160991184845074959L;
      class_2680 var1 = class_2246.field_10536.method_9564();
      class_2680 var2 = class_2246.field_10466.method_9564();
      class_2680 var3 = class_2246.field_10338.method_9564();
      class_2680[] var4 = new class_2680[]{var1, var3, var2, var1, var1, var2, var3, var1};

      for (long var8 = var6 ^ (-17179869184L ^ var6) & -1L << 32; (int)(var8 >>> 32) <= 3; var8 += 4294967296L) {
         this.IIIllIIliIIl((int)(var8 >>> 32), 0, 2, ((int)(var8 >>> 32) & 1) == 0 ? var1 : var2);
         this.IIIllIIliIIl((int)(var8 >>> 32), 0, 3, var4[(int)(var8 >>> 32) + 4]);
         this.IIIllIIliIIl((int)(var8 >>> 32), 0, 4, ((int)(var8 >>> 32) & 1) == 0 ? var2 : var1);
      }
   }

   static int IilliliilIIi(long k) {
      return (int)(k & 1048575L) - 512;
   }

   static int iIlIlllllill(long k) {
      return (int)(k >>> 20 & 1048575L) - 512;
   }
}
