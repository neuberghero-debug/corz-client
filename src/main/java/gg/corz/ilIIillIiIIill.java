package gg.corz;

import java.util.Arrays;
import net.minecraft.class_11659;
import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_4608;
import net.minecraft.class_630;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

final class ilIIillIiIIill {
   private static class_630 lliIilIIiiliIilIIi;
   static final String[] IiIIilIIiliIIilIIi = new String[]{
      Iilllilliill<"Iilllilliill","IKOSEB0mhGxLHab/f0b7CNTqsGpoL7pUPqHevu6LOi52w2hbuJs7SosXA44+hQ==">(),
      Iilllilliill<"Iilllilliill","xWkuv7acB1u/IOCFEk9eHN0JPXozCIIh1ewj1L867iGirtZCZcSrSOWz6hIU">(),
      Iilllilliill<"Iilllilliill","DIDFr3V2qikS82U7PoJT7pVYRWpLD1QlMHKoIr9PXofKbiqzIg6imIX0wheLDbk=">(),
      Iilllilliill<"Iilllilliill","YwFJfXQNawJ3prnKyvOmXMvdWf7YXFo3X2PlBP8a+BW1">(),
      Iilllilliill<"Iilllilliill","ZssBgTHM/yykcTK7LdlKqSX62FOoXUyTuPygeRi+VmB2">()
   };
   static final String[] llIiilIIiilIiilIIi = new String[]{
      Iilllilliill<"Iilllilliill","WOE77GmsRmwwKcQvYIpkJa3qVFOwjb2Gql7qi7vvh8A97PcY/GOU1ilZqAfboqRnqos=">(),
      Iilllilliill<"Iilllilliill","k7mGC3HU7AT1Si/5cK+lRz6DCw+kj4VdPGhbH0aWq+xvGK7OWRAxT2oSY5zoGDLAsVo=">(),
      Iilllilliill<"Iilllilliill","HKyqNu6SwH942bKYStIDV7cRZI03Tc7/3r1XT0OpSPsmFhNIZwFCgYvCAz9eFg==">(),
      Iilllilliill<"Iilllilliill","oD2PhFeXeLcKm3TBxHGzGmep8cmD4f1bSON8mUk3RvcQqG96OZm6GWDLpyQb">()
   };
   private static final long[] lIililIIiiIililIIi = new long[3];
   static final long ilililIIiIiililIIi = 2500000000L;
   private static final float[] IIllilIIilIllilIIi = new float[2];
   static final String[][] llIIilIIiilIIilIIi = new String[][]{
      {
            Iilllilliill<"Iilllilliill","ctPczQo4Jog2q53kGiiwhK8VdLu1GVvbzSO0ma8JagIWXcBvMhszjk7i8IEJm9SnlcQE0Q8=">(),
            Iilllilliill<"Iilllilliill","6KguXrbE+Ercstp8VfSST30Km06V7fwS+2mi0itNNMa1fNESp9zLlWSBF89Z1nESr7ciYGfpHftN">()
      },
      {
            Iilllilliill<"Iilllilliill","AvCAVDExZWwQUZzEET6NqHbNKkXEZCrVMb+LOs/miFLLJCZ7/7hoMRSTNf9i/cOw">(),
            Iilllilliill<"Iilllilliill","eVfgHjHNrX40UX85ytMG0QVbgE4uNb++xiXhY21Wd9wqr/OSvDNZS7d05Fk2">()
      },
      {
            Iilllilliill<"Iilllilliill","M277qAi589Xvc+QkvasHzn5Am06g96aab7Ij+39UbBb2FHrVuT2wgLOwbpzalLJm">(),
            Iilllilliill<"Iilllilliill","QfmrXejroje7nzis3Xb6jBZ8JHO5WCUQirRfcne+RjcuQk+2lbcIr1P8SXkF2iY=">()
      },
      {
            Iilllilliill<"Iilllilliill","zmnhDeWyyMLd+C6O3Xh1Ygbh0x2BdW1eZAetj372a4ey3FfSULzny15EkZs=">(),
            Iilllilliill<"Iilllilliill","DYA/5dQZY37GE/zTpPw1e3ziJKrC6KhttsiqBuO09pQJZS7KjH9+3J5rhrhqWpfP2dZv">()
      },
      {
            Iilllilliill<"Iilllilliill","sFh9hAHvsJt3GR2o+RvJ1gYfUncufmt5JXiadySidHbcII8QC9FFqgRSoIU=">(),
            Iilllilliill<"Iilllilliill","GkCiPgdFuQsgfwf/bQ76kfHjaFScbts9nBEZRKJ098RADFzKSv0QojALAlL79jDcG/ZGtF4QeGOXogzq5g==">()
      },
      {
            Iilllilliill<"Iilllilliill","oVwnN6Tmd+CFiLTIKT973FIDtNhV3o+yuHk7hNmFR9cD0g1a4cdlSyQSoLxXjX3A">(),
            Iilllilliill<"Iilllilliill","MWLpiAJFzKv7Ux6Dvat5wf+Vn89AQqOaC2EF/E7c4rDc+W0gHvu9XNm6JjEp5Orrqo80D38=">()
      },
      {
            Iilllilliill<"Iilllilliill","F9mMch1GApZxUYHWaiwxR2uqLNl6MQaSO3SdgJIi2Bw0SeU1/queJZXopIg5QPuWIV4=">(),
            Iilllilliill<"Iilllilliill","KnlwbrqL373krT8G/8fuO8pYam3d+W3m5E8d/KUtNhCGO/hUPh8FgeGhmEkZo1kVqAkT">()
      },
      {
            Iilllilliill<"Iilllilliill","jlPX9gzRHh5PWZd9SIBcltO/X2kbypM/ahw8xoQLhX9RXfAR4ViXB5AI3RedzUfwm+ce">(),
            Iilllilliill<"Iilllilliill","x/CwU5Z8AkHi6HdBCrjayynMJzkg3PeKYUUQEA6shdHeiNVB/TJohEPLYlbRh6lpQRnT">()
      },
      {
            Iilllilliill<"Iilllilliill","esg9dqOBvbT6kn/2AeN4TgMBooaJgORZlqPKE77gLgUw0DcZ7RKjFGPuIhyuARX/frp0VO21gYMi">(),
            Iilllilliill<"Iilllilliill","vf3pl5O0sDNdy5+xPdg0Eh8azxN5s0LPBmejg3VLye5tS7/ZHmNGcvt+RuyipEMXDk6TMOnM5pjITf2x">()
      },
      {
            Iilllilliill<"Iilllilliill","dHFLVt8MEBujqoe9dyRUjtt9b2pWQjbLRKDK70F7Dyo4Ki6c99dY5WZY7rcDfQ==">(),
            Iilllilliill<"Iilllilliill","MYUP0XtV2LADc0P8pSHVqTetDJUUw8LsP0O6G856LauRqP40MqCrIoujcH2NFVjrECjqNV0=">()
      },
      {
            Iilllilliill<"Iilllilliill","oNmnKfsAWaIYmaiY20BmlV3JPFPxEOs+nJVFh2rB385LEe0QgaJCYHULxU4RObCXQJazcBeNzitF">(),
            Iilllilliill<"Iilllilliill","isMOdNXemD5qC1RnszElZ6Xx4HeNwVioszOvC1hZ1Wms48ZywqK7SLLcZ9VpqpB0vkO4oYM=">()
      },
      {
            Iilllilliill<"Iilllilliill","qhmhmre1pZ2jyP0AQpLC7nOSTsiIzJZ+smZV2ISlrwxwwZ6qQK472dTaoSs=">(),
            Iilllilliill<"Iilllilliill","/GZqF3fiPT+pjihU68CAByva5E8Jt9MwayEz4/DmLIyC90ANsSoHC4RZBg==">()
      },
      {
            Iilllilliill<"Iilllilliill","FOP2pr08eYeAcSUBXRRzW74TiqVkQbS1j3UILO/Ud7seakb8t07A+Ouz7bwvLduDGbHySogfFOqkeV8=">(),
            Iilllilliill<"Iilllilliill","QmenPV5o4ZHB9aft5GYht4XaWPN8ZYQhGNzIEvJcpV/IDIFNgLZd1mRg9fE7UK3d8w==">()
      }
   };
   static final float[][] iIIiilIIiIlIiilIIi = new float[][]{{0.35F, 1.55F, 0.0F}, {1.6F, 2.8F, 1.0F}, {3.2F, 4.4F, 0.0F}, {4.5F, 5.8F, 1.0F}};
   private static final Matrix4f IIIiilIIilIIiilIIi = new Matrix4f();
   private static float IlIlilIIillIlilIIi;
   private static class_630 IiiIilIIiliiIilIIi;
   static final float illIilIIiIilIilIIi = 2.9F;
   private static float iillilIIiIIililIIi;
   private static float ilIlilIIiIiIlilIIi = -0.8F;
   private static int liIlilIIiiiIlilIIi;
   private static llIIiIililIIiIil iIiIilIIiIliIilIIi;
   static final float IllIilIIilllIilIIi = 1100.0F;
   private static final String[] llllilIIiilllilIIi = new String[2];
   private static boolean lIIlilIIiiIIlilIIi;
   static final float iiIIilIIiIIlIilIIi = 1.9F;
   private static int IlililIIillililIIi;
   private static boolean liililIIiiiililIIi;
   static final float lIlIilIIiiIlIilIIi = 31.0F;
   private static float IillilIIilillilIIi;
   static final float lilIilIIiiilIilIIi = 0.45F;
   private static final float[] iIllilIIiIlllilIIi = new float[]{-1.0F, -1.0F};
   static final float IIiIilIIilIiIilIIi = 4.8F;
   private static class_1921 iiiIilIIiIIIlilIIi;

   private ilIIillIiIIill() {
   }

   private static int lIiiIiIlilli() {
      long var2 = 7165592969544040897L;
      if (!ilIIllIiIIll.IliIlllilIi()) {
         return -1;
      } else {
         float var0 = ilIIllIiIIll.liilliiill();

         for (long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < iIIiilIIiIlIiilIIi.length; var4 += 4294967296L) {
            if (var0 >= iIIiilIIiIlIiilIIi[(int)(var4 >>> 32)][0] && var0 < iIIiilIIiIlIiilIIi[(int)(var4 >>> 32)][1]) {
               return (int)(var4 >>> 32);
            }
         }

         return -1;
      }
   }

   private static int iliIiiliiiii() {
      long var1 = 8533137369267792061L;
      if (ilIIllIiIIll.IliIlllilIi()) {
         var1 ^= ((long)lIiiIiIlilli() << 32 ^ var1) & -1L << 32;
         return (int)(var1 >>> 32) < 0 ? -1 : (int)iIIiilIIiIlIiilIIi[(int)(var1 >>> 32)][2];
      } else if (ilIlilIIiIiIlilIIi < 0.0F) {
         return -1;
      } else if (ilIlilIIiIiIlilIIi < 2.9F) {
         return 0;
      } else if (ilIlilIIiIiIlilIIi < 3.3500001F) {
         return -1;
      } else {
         return ilIlilIIiIiIlilIIi < 6.25F ? 1 : -1;
      }
   }

   static boolean IIlllIlliIll(double my, double mx) {
      long var10 = -4251786806241006744L;
      if (liililIIiiiililIIi && !(IlIlilIIillIlilIIi < 0.5F)) {
         for (long var12 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var12 >>> 32) < 2; var12 += 4294967296L) {
            float var5 = IillilIIilillilIIi - 96.0F + (float)((int)(var12 >>> 32)) * 31.0F;
            if (my >= (double)(var5 - 10.0F)
               && my <= (double)(var5 + 10.0F)
               && mx >= (double)(iillilIIiIIililIIi - 30.0F)
               && mx <= (double)(iillilIIiIIililIIi + 10.0F)) {
               IIllilIIilIllilIIi[(int)(var12 >>> 32)] = 1.0F;
               iIllilIIiIlllilIIi[(int)(var12 >>> 32)] = 0.0F;
               llllilIIiilllilIIi[(int)(var12 >>> 32)] = IiIIilIIiliIIilIIi[(int)(
                     IIIiIillIIiIil.IiiIlliiIl((int)(IIIiIillIIiIil.liiIiIiIiiiiIiIiIi * 7.0), (int)(var12 >>> 32)) * (float)IiIIilIIiliIIilIIi.length
                  )
                  % IiIIilIIiliIIilIIi.length];
               long var6 = System.nanoTime();
               lIililIIiiIililIIi[IlililIIillililIIi] = var6;
               IlililIIillililIIi = (IlililIIillililIIi + 1) % lIililIIiiIililIIi.length;
               long var8 = lIililIIiiIililIIi[IlililIIillililIIi];
               if (var8 != 0L && var6 - var8 <= 2500000000L && ilIIllIiIIll.IIIllIIliIIl()) {
                  Arrays.fill(lIililIIiiIililIIi, 0L);
                  llllilIIiilllilIIi[(int)(var12 >>> 32)] = Iilllilliill<"Iilllilliill","B4GGLIm5Uxav1qZil253KWMlh5jbODNVhdUTur4rk9iXVYJDFgpKu71hmTNCdA==">();
               }

               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static void IlIlllIlilIl(class_630 talk, int phase, boolean i, float g, float t) {
      class_630 var5 = talk.method_32086(Iilllilliill<"Iilllilliill","eOGgUF99sOLlquI9EhJTZYxIAWs2RCSuEWG+168wkFA=">());
      class_630 var6 = talk.method_32086(Iilllilliill<"Iilllilliill","oSGnqf9ZzThy0xNprybtfIjsrVADf/IddqcigaRJF0Of">());
      class_630 var7 = talk.method_32086(Iilllilliill<"Iilllilliill","gzs5U0pIQvJRg93UPjPmw9vFctm4mYKwJpetJHoV72+e">());
      class_630 var8 = talk.method_32086(Iilllilliill<"Iilllilliill","bgwgJPRaD5wwMc8bWcdGNf5Wg+A1K1kQp3RkLyN0DEXJ">());
      class_630 var9 = talk.method_32086(Iilllilliill<"Iilllilliill","DeZwtOKLDmJxiXoDCxSwSCsAwm1hHw2AnE0o99HIB98p">());
      float var10 = (float)Math.sin((double)(g * 1.6F));
      var8.field_3654 = -1.2F + 0.28F * var10;
      var9.field_3654 = -1.2F - 0.28F * var10;
      float var11 = phase == 0 ? 1.0F : -1.0F;
      var5.field_3674 = var11 * (i ? 0.16F + 0.05F * (float)Math.sin((double)(t * 9.0F)) : 0.05F);
      var5.field_3654 = i ? 0.08F * (float)Math.sin((double)(t * 7.3F)) : 0.04F * (float)Math.sin((double)g);
      var6.field_3654 = i && phase == 1 ? -1.2F - 0.35F * (float)Math.sin((double)(t * 6.0F)) : -0.25F;
      var7.field_3654 = i && phase == 0 ? -1.2F - 0.35F * (float)Math.sin((double)(t * 6.0F)) : -0.25F;
      var6.field_3674 = -0.35F;
      var7.field_3674 = 0.35F;
   }

   private static void IiIlliIliiIl(class_332 px, int w, int ctx, int alpha, float py) {
      long var13 = 2986394018285417243L;
      long var15 = -9169807173955954200L;
      if (ctx >= 46) {
         var13 ^= ((long)iliIiiliiiii() << 32 ^ var13) & -1L << 32;

         for (long var20 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var20 < 2; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
            String var7 = null;
            float var8 = 0.0F;
            float var9 = 1.0F;
            if (iIllilIIiIlllilIIi[(int)var20] >= 0.0F && iIllilIIiIlllilIIi[(int)var20] < 1.6F) {
               var7 = llllilIIiilllilIIi[(int)var20];
               var8 = ilIIllIiIIll.llIililIil(Math.min(1.0F, iIllilIIiIlllilIIi[(int)var20] / 0.12F))
                  * ilIIllIiIIll.llIililIil(Math.min(1.0F, (1.6F - iIllilIIiIlllilIIi[(int)var20]) / 0.25F));
               var9 = 0.85F + 0.15F * ilIIllIiIIll.llIililIil(Math.min(1.0F, iIllilIIiIlllilIIi[(int)var20] / 0.15F));
            } else if ((int)(var20 >>> 32) == (int)var20 && lIiiIiIlilli() >= 0) {
               var15 ^= ((long)lIiiIiIlilli() << 32 ^ var15) & -1L << 32;
               float var11 = ilIIllIiIIll.liilliiill() - iIIiilIIiIlIiilIIi[(int)(var15 >>> 32)][0];
               float var12 = iIIiilIIiIlIiilIIi[(int)(var15 >>> 32)][1] - iIIiilIIiIlIiilIIi[(int)(var15 >>> 32)][0];
               var7 = llIiilIIiilIiilIIi[(int)(var15 >>> 32)];
               var8 = ilIIllIiIIll.llIililIil(Math.min(1.0F, var11 / 0.14F)) * ilIIllIiIIll.llIililIil(Math.min(1.0F, (var12 - var11) / 0.18F));
               var9 = 0.86F + 0.14F * ilIIllIiIIll.llIililIil(Math.min(1.0F, var11 / 0.16F));
            } else if ((int)(var20 >>> 32) == (int)var20) {
               float var10 = ilIlilIIiIiIlilIIi - ((int)var20 == 0 ? 0.0F : 3.3500001F);
               var7 = llIIilIIiilIIilIIi[liIlilIIiiiIlilIIi][(int)var20];
               var8 = ilIIllIiIIll.llIililIil(Math.min(1.0F, var10 / 0.16F)) * ilIIllIiIIll.llIililIil(Math.min(1.0F, (2.9F - var10) / 0.22F));
               var9 = 0.86F + 0.14F * ilIIllIiIIll.llIililIil(Math.min(1.0F, var10 / 0.18F));
            }

            if (var7 != null && !(var8 <= 0.01F)) {
               float var17 = iIlIlllllill(w, alpha, (int)var20) + ((int)var20 == 0 ? -2.0F : 2.0F);
               float var18 = (float)ctx - 2.2F - 22.8F - 4.0F - 9.0F * (float)Math.sin((double)Math.min(1.0F, IIllilIIilIllilIIi[(int)var20]) * Math.PI);
               iiilIillIIIiIill.IliIlllilIi(px, var7, var17, var18, 0.72F, var8 * py, (int)var20 == 1, var9);
            }
         }
      }
   }

   static float iIlIlllllill(int px, int who, int w) {
      return (float)(px + who) - 96.0F + (float)w * 31.0F;
   }

   static void IliIlllilIi() {
      if (iIiIilIIiIliIilIIi != null) {
         iIiIilIIiIliIilIIi.IiIiliIiiiIi();
      }

      iIiIilIIiIliIilIIi = null;
      IlIlilIIillIlilIIi = 0.0F;
      ilIlilIIiIiIlilIIi = -0.8F;
      Arrays.fill(lIililIIiiIililIIi, 0L);
      iIllilIIiIlllilIIi[0] = iIllilIIiIlllilIIi[1] = -1.0F;
      IIllilIIilIllilIIi[0] = IIllilIIilIllilIIi[1] = 0.0F;
   }

   static void IilliliilIIi(class_332 sw, int w, int ctx, int px, int py, int sh) {
      long var21 = 7410553828935057966L;
      long var23 = 1177134637770781660L;
      float var6 = IIIiIillIIiIil.IIIliIiIilIIliIiIi;
      var21 ^= ((long)(IIIiIillIIiIil.liiiIIllIl() && liiiIIllIl(ctx) && IIIiIillIIiIil.IliIlllilIi() > 0.5F ? 1 : 0) << 32 ^ var21) & -1L << 32;
      float var8 = (int)(var21 >>> 32) != 0 ? 1.0F : 0.0F;
      IlIlilIIillIlilIIi = IlIlilIIillIlilIIi + (var8 - IlIlilIIillIlilIIi) * (1.0F - (float)Math.exp((double)(-5.0F * var6)));
      if ((int)(var21 >>> 32) == 0 && IlIlilIIillIlilIIi < 0.01F) {
         IlIlilIIillIlilIIi = 0.0F;
      }

      liililIIiiiililIIi = false;
      if (!(IlIlilIIillIlilIIi <= 0.01F) && !lIIlilIIiiIIlilIIi) {
         float var9 = IlIlilIIillIlilIIi * IliiIilliiIi.IIIllIIliIIl();
         if (!(var9 <= 0.01F)) {
            if (!ilIIllIiIIll.IliIlllilIi()) {
               ilIlilIIiIiIlilIIi += var6;
            }

            float var10 = 11.05F;
            if (ilIlilIIiIiIlilIIi > var10) {
               ilIlilIIiIiIlilIIi -= var10;
               liIlilIIiiiIlilIIi = (liIlilIIiiiIlilIIi + 1) % llIIilIIiilIIilIIi.length;
            }

            for (long var28 = var21 ^ (0L ^ var21) & -1L >>> 32; (int)var28 < 2; var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
               IIllilIIilIllilIIi[(int)var28] = Math.max(0.0F, IIllilIIilIllilIIi[(int)var28] - var6 * 2.6F);
               if (iIllilIIiIlllilIIi[(int)var28] >= 0.0F) {
                  iIllilIIiIlllilIIi[(int)var28] = iIllilIIiIlllilIIi[(int)var28] + var6;
                  if (iIllilIIiIlllilIIi[(int)var28] > 2.0F) {
                     iIllilIIiIlllilIIi[(int)var28] = -1.0F;
                  }
               }
            }

            float var11 = (float)(w + px) - 150.0F;
            float var12 = (float)(w + px) - 16.0F;
            float var13 = (float)ctx - 56.0F;
            float var14 = (float)ctx + 22.0F;
            IillilIIilillilIIi = (float)(w + px);
            iillilIIiIIililIIi = (float)ctx;
            liililIIiiiililIIi = true;

            try {
               class_310 var15 = class_310.method_1551();
               if (lliIilIIiiliIilIIi == null) {
                  liiIiIIiiiiIiIIi.liiiIIllIl(var15);
                  lliIilIIiiliIilIIi = liiIiIIiiiiIiIIi.lIiiIiIlilli();
                  IiiIilIIiliiIilIIi = liiIiIIiiiiIiIIi.lIiiIiIlilli();
                  iiiIilIIiIIIlilIIi = class_12249.method_75994(liiIiIIiiiiIiIIi.lilllliiil);
               }

               float var16 = (float)var15.method_22683().method_4489() / (float)Math.max(1, py);
               var23 ^= ((long)Math.max(8, Math.round((var12 - var11) * var16)) << 32 ^ var23) & -1L << 32;
               var23 ^= ((long)Math.max(8, Math.round((var14 - var13) * var16)) ^ var23) & -1L >>> 32;
               float var19 = 55.0F;
               IIIiilIIilIIiilIIi.setFrustum(
                  (var11 - (float)py / 2.0F) * var19 / 1100.0F,
                  (var12 - (float)py / 2.0F) * var19 / 1100.0F,
                  -(var14 - (float)sh / 2.0F) * var19 / 1100.0F,
                  -(var13 - (float)sh / 2.0F) * var19 / 1100.0F,
                  var19,
                  22000.0F
               );
               IliiIilliiIi.lilIliilIl();
               if (iIiIilIIiIliIilIIi == null) {
                  iIiIilIIiIliIilIIi = new llIIiIililIIiIil(
                     Iilllilliill<"Iilllilliill","y4NtcYEdZw8A6EuIXZDLt4HKTLp4VGstb4oAC8b+CBneKw==">(),
                     IIIiIillIIiIil.IiIilIiIiliIilIiIi,
                     IIIiIillIIiIil.iiIilIiIiIIlilIiIi
                  );
               }

               iIiIilIIiIliIilIIi.iliIiiliiiii((int)(var23 >>> 32), (int)var23);
               iIiIilIIiIliIilIIi.IiIlliIliiIl(0, 0, (int)(var23 >>> 32), (int)var23, IIIiilIIilIIiilIIi, (q, swx) -> IIIllIIliIIl(q, swx, w, ctx, px, py, sh));
               Matrix4f var20 = IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761();
               iIiIilIIiIliIilIIi.IIlllIlliIll(
                  var20,
                  var11,
                  var13,
                  var12 - var11,
                  var14 - var13,
                  iIiIilIIiIliIilIIi.Ililllililil(0.0F),
                  iIiIilIIiIliIilIIi.Iiilliiliiil(0.0F),
                  iIiIilIIiIliIilIIi.Ililllililil((float)((int)(var23 >>> 32))),
                  iIiIilIIiIliIilIIi.Iiilliiliiil((float)((int)var23)),
                  var11,
                  var13,
                  var12,
                  var14,
                  0.0F,
                  var9
               );
               IiIlliIliiIl(sw, w, ctx, px, IlIlilIIillIlilIIi);
            } catch (Throwable var26) {
               lIIlilIIiiIIlilIIi = true;

               try {
                  class_310.method_1551().field_1773.method_72911().method_73003().method_72953();
               } catch (Throwable var25) {
               }
            }
         }
      }
   }

   static boolean liiiIIllIl(int py) {
      return py >= 26;
   }

   private static void IIIllIIliIIl(class_4587 px, class_11659 sw, int m, int w, int q, int py, int sh) {
      long var17 = 6615444254920496453L;
      long var15 = 7048986070582325759L;
      px.method_46416(0.0F, 0.0F, -1100.0F);
      px.method_22905(1.0F, -1.0F, 1.0F);
      px.method_46416((float)(-py) / 2.0F, (float)(-sh) / 2.0F, 0.0F);
      var15 ^= ((long)iliIiiliiiii() << 32 ^ var15) & -1L << 32;
      float var8 = (float)IIIiIillIIiIil.liiIiIiIiiiiIiIiIi;

      for (long var20 = var15 ^ (0L ^ var15) & -1L >>> 32; (int)var20 < 2; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
         class_630 var10 = (int)var20 == 0 ? lliIilIIiiliIilIIi : IiiIilIIiliiIilIIi;
         var17 ^= (
               (long)((int)(var20 >>> 32) != (int)var20 && (!(iIllilIIiIlllilIIi[(int)var20] >= 0.0F) || !(iIllilIIiIlllilIIi[(int)var20] < 1.4F)) ? 0 : 1)
                     << 32
                  ^ var17
            )
            & -1L << 32;
         float var12 = var8 * 1.7F + (float)((int)var20) * 1.9F;
         float var13 = -9.0F * (float)Math.sin((double)Math.min(1.0F, IIllilIIilIllilIIi[(int)var20]) * Math.PI);
         IlIlllIlilIl(var10, (int)var20, (boolean)((int)(var17 >>> 32)), var12, var8);
         px.method_22903();
         px.method_46416(iIlIlllllill(m, q, (int)var20), (float)w - 2.2F + var13, 6.0F);
         px.method_22907(new Quaternionf().rotateY((float)Math.toRadians((int)var20 == 0 ? -24.0 : 24.0)));
         px.method_22907(new Quaternionf().rotateX(-0.12F));
         float var14 = 30.4F;
         px.method_22905(var14, var14, -var14);
         sw.method_73492(var10, px, iiiIilIIiIIIlilIIi, 15728880, class_4608.field_21444, null, -5678, null);
         px.method_22909();
      }
   }
}
