package gg.corz;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4588;
import net.minecraft.class_4770;
import net.minecraft.class_2338.class_2339;
import org.joml.Matrix4f;

public class Iiiilillliiilill extends ilIllIiIll {
   private final iliiliilIiiiliil illIlliill;
   private final iliiliilIiiiliil lllIlliill = new iliiliilIiiiliil(
      IliIlllilIi<"IliIlllilIi","eWk6zJJdaMw+MiRPX6R/AE3EkRrojBIFMHdZoWcYcmYZzvCV1GCQ">(),
      IliIlllilIi<"IliIlllilIi","wjM7N+b2DNfnci+7EOIx1un3bx4opwEWdz4wDprQKDkekENI8V60U3dHeSh+qQTG9x8y2YO2s/auvSBXNH/+T75saT3t">(),
      -42464
   );
   private final IIIIlilllIIIlill lIiIlliill;
   private final IIIIlilllIIIlill iIiIlliill;
   private static final int lIlllliill = 14;
   private final IIIIlilllIIIlill IliIlliill;
   private final iiIiiilIIliiil IilIlliill;
   private static final float lllllliill = 0.32F;
   private static final float[][] illllliill = new float[][]{{0.7071F, 0.7071F}, {0.7071F, -0.7071F}};
   private final IIIIlilllIIIlill IIiIlliill;
   private final int[] Iilllliill;
   private int IlIllliill;
   private int iiIllliill;
   private long lIIllliill;
   private final long IIIllliill;
   private static final float Illllliill = 0.6F;
   private final IIIIlilllIIIlill iiiIlliill;
   private static final int iIlllliill = 3;
   private final ilIIliIlIiIIliIl ilIllliill;
   private float iIIllliill;
   private final List<class_2338> liIllliill;
   private final IIIIlilllIIIlill lilIlliill;
   private final iiIiiilIIliiil IiiIlliill;
   private final IIIIlilllIIIlill iilIlliill;
   private boolean llIllliill;
   private final lliliIIiililiIIi iliIlliill;
   private final IIIIlilllIIIlill lliIlliill;
   private final float[] lilllliill;
   private boolean IIlllliill;
   private final iiIiiilIIliiil liiIlliill;
   private long IiIllliill;

   private void lllllillll(
      class_4588 phase,
      Matrix4f worldH,
      float style,
      float baseY,
      float t,
      float m,
      float colors,
      float cz,
      float vc,
      int intensity,
      float dirZ,
      float dirX,
      int[] cx
   ) {
      float[] var14 = this.lilllliill;

      for (int var15 = 0; var15 <= 14; var15++) {
         var14[var15] = Iillllilll((float)var15 / 14.0F, cz, vc, intensity, dirZ, dirX);
      }

      for (int var33 = 0; var33 < 14; var33++) {
         float var16 = (float)var33 / 14.0F;
         float var17 = (float)(var33 + 1) / 14.0F;
         float var18 = var14[var33];
         float var19 = var14[var33 + 1];
         float var20 = (var16 - 0.5F) * 2.0F * 0.6F;
         float var21 = (var17 - 0.5F) * 2.0F * 0.6F;
         float var22 = style + m * var20;
         float var23 = t + colors * var20;
         float var24 = style + m * var21;
         float var25 = t + colors * var21;

         for (int var26 = 0; var26 < 3; var26++) {
            float var27 = (float)var26 / 3.0F;
            float var28 = (float)(var26 + 1) / 3.0F;
            int var29 = cx[var33 * 4 + var26];
            int var30 = cx[(var33 + 1) * 4 + var26];
            int var31 = cx[(var33 + 1) * 4 + var26 + 1];
            int var32 = cx[var33 * 4 + var26 + 1];
            iIiiIIilIliiIIil.IlIlllIlilIl(
               phase,
               worldH,
               var22,
               baseY + var27 * var18,
               var23,
               var29,
               var24,
               baseY + var27 * var19,
               var25,
               var30,
               var24,
               baseY + var28 * var19,
               var25,
               var31,
               var22,
               baseY + var28 * var18,
               var23,
               var32
            );
         }
      }
   }

   @Override
   public void IIiilIiiiIii(illlllIillll event) {
      if (lIIlliIIll() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (!this.liIllliill.isEmpty()) {
            class_4184 var2 = Iiiilllliiilll.field_1773.method_19418();
            if (var2 != null) {
               class_243 var3 = var2.method_71156();
               float var4 = (float)((double)(System.nanoTime() - this.IIIllliill) / 1.0E9 % 3600.0) * IlIIIillIIIi.iliIiiliiiii(this.IIiIlliill.Iilllilliill());
               int var5 = IlIIIillIIIi.Illlllllilll(this.iliIlliill.Iilllilliill());
               float var6 = IlIIIillIIIi.IIIllIIliIIl(this.lIiIlliill.Iilllilliill());
               float var7 = IlIIIillIIIi.lIiiIiIlilli(this.iilIlliill.Iilllilliill());
               float var8 = (float)this.iiiIlliill.Iilllilliill();
               int var9 = this.lllIlliill.Iilllilliill();
               int var10 = this.IilIlliill.Iilllilliill() ? IlIIIillIIIi.Ililllililil(var9) : this.illIlliill.Iilllilliill();
               int[] var11 = this.Iilllliill;

               for (int var12 = 0; var12 <= 14; var12++) {
                  for (int var13 = 0; var13 <= 3; var13++) {
                     var11[var12 * 4 + var13] = iilllIIill((float)var12 / 14.0F, (float)var13 / 3.0F, var9, var10, var7);
                  }
               }

               event.IliiiIIilliiiIIi.method_22903();
               event.IliiiIIilliiiIIi.method_22904(-var3.field_1352, -var3.field_1351, -var3.field_1350);
               Matrix4f var16 = event.IliiiIIilliiiIIi.method_23760().method_23761();
               class_4588 var17 = iIiiIIilIliiIIil.lIiiIiIlilli();

               for (class_2338 var15 : this.liIllliill) {
                  this.iIlllIllll(var17, var16, var15, var4, var5, var6, var8, var11);
               }

               event.IliiiIIilliiiIIi.method_22909();
            }
         }
      }
   }

   @Override
   protected void Illillliilli() {
      this.IlIllllIll();
   }

   private void iIlllIllll(class_4588 m, Matrix4f style, class_2338 vc, float pos, int worldH, float t, float colors, int[] intensity) {
      float var9 = (float)vc.method_10263() + 0.5F;
      float var10 = (float)vc.method_10264() + 0.01F;
      float var11 = (float)vc.method_10260() + 0.5F;
      float var12 = (float)vc.method_10263() * 0.37F + (float)vc.method_10260() * 0.61F;

      for (int var13 = 0; var13 < illllliill.length; var13++) {
         this.lllllillll(
            m, style, var9, var10, var11, illllliill[var13][0], illllliill[var13][1], var12 + (float)var13 * 3.1F, pos, worldH, t, colors, intensity
         );
      }
   }

   public boolean iiiIlIIIll() {
      return this.IiiIlliill.Iilllilliill();
   }

   private static float Iillllilll(float style, float t, float intensity, int worldH, float phase, float u) {
      float var6 = IlIIIillIIIi.Iiiiliiiiiii(style + t, intensity, worldH, phase);
      float var7 = 0.32F + 0.68F * var6;
      float var8 = 0.6F + 0.4F * (1.0F - Math.abs(style - 0.5F) * 2.0F);
      return u * var7 * var8;
   }

   private static int iilllIIill(float primary, float v, int opacity, int secondary, float u) {
      float var5 = 1.0F - Math.min(1.0F, Math.abs(primary - 0.5F) * 2.0F);
      float var6 = IlIIIillIIIi.IliIlllilIi((1.0F - v) * (0.35F + 0.65F * var5), 0.0F, 1.0F);
      int var7 = opacity >> 16 & 0xFF;
      int var8 = opacity >> 8 & 0xFF;
      int var9 = opacity & 0xFF;
      int var10 = secondary >> 16 & 0xFF;
      int var11 = secondary >> 8 & 0xFF;
      int var12 = secondary & 0xFF;
      int var13 = Math.round((float)var7 + (float)(var10 - var7) * var6);
      int var14 = Math.round((float)var8 + (float)(var11 - var8) * var6);
      int var15 = Math.round((float)var9 + (float)(var12 - var9) * var6);
      float var16 = (float)Math.pow((double)IlIIIillIIIi.IliIlllilIi(1.0F - v, 0.0F, 1.0F), 0.6);
      int var17 = Math.round(255.0F * u * var16);
      var17 = var17 < 0 ? 0 : Math.min(var17, 255);
      return var17 << 24 | var13 << 16 | var14 << 8 | var15;
   }

   @Override
   public void Iliilliiilii(lIiIlliiIiIlli event) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         long var2 = System.nanoTime();
         IlIIIillIIIi.iIIIlIlIIl(() -> {
            IlIIIillIIIi.llIIlilIIl(() -> this.liIlliiIll(var2), () -> this.lIIllliill = var2);
            return true;
         });
      }
   }

   private void liIlliiIll(long now) {
      boolean var3 = Iiiilllliiilll.field_1690.method_31044().method_31034();
      boolean var4 = Iiiilllliiilll.field_1755 != null;
      boolean var5 = Iiiilllliiilll.field_1724.method_5809();
      double var6 = this.lIIllliill == 0L ? 0.0 : (double)(now - this.lIIllliill) / 1.0E9;
      var6 = IlIIIillIIIi.liiiIIllIl(var6, 0.0, 0.1);
      boolean var8 = var5 && var3 && !var4;
      this.iIIllliill = IlIIIillIIIi.Iiilliiliiil(this.iIIllliill, var8, var6);
      if (this.IliIlllilIi() && this.IiiIlliill.Iilllilliill() && var3 && var5) {
         boolean var45 = true;
      } else {
         boolean var10000 = false;
      }

      if (IlIIIillIIIi.IIIilIIiiIIi(this.IliIlllilIi(), var3, var4, this.iIIllliill)) {
         int var10 = this.lllIlliill.Iilllilliill();
         int var11 = this.IilIlliill.Iilllilliill() ? IlIIIillIIIi.Ililllililil(var10) : this.illIlliill.Iilllilliill();
         float var12 = (float)(var10 >> 16 & 0xFF) / 255.0F;
         float var13 = (float)(var10 >> 8 & 0xFF) / 255.0F;
         float var14 = (float)(var10 & 0xFF) / 255.0F;
         float var15 = (float)(var10 >>> 24 & 0xFF) / 255.0F;
         float var16 = (float)(var11 >> 16 & 0xFF) / 255.0F;
         float var17 = (float)(var11 >> 8 & 0xFF) / 255.0F;
         float var18 = (float)(var11 & 0xFF) / 255.0F;
         float var19 = IlIIIillIIIi.IilliliilIIi(this.lilIlliill.Iilllilliill());
         float var20 = IlIIIillIIIi.lIiiIiIlilli(this.iilIlliill.Iilllilliill());
         float var21 = IlIIIillIIIi.iliIiiliiiii(this.IIiIlliill.Iilllilliill());
         float var22 = IlIIIillIIIi.IIIllIIliIIl(this.lIiIlliill.Iilllilliill());
         float var23 = IlIIIillIIIi.IlIlllIlilIl(this.iIiIlliill.Iilllilliill());
         float var24 = IlIIIillIIIi.IiIlliIliiIl(this.IliIlliill.Iilllilliill());
         float var25 = IlIIIillIIIi.IIlllIlliIll(this.lliIlliill.Iilllilliill());
         int var26 = IlIIIillIIIi.Illlllllilll(this.iliIlliill.Iilllilliill());
         double var27 = (double)Iiiilllliiilll.method_22683().method_4495();
         float var29 = (float)Iiiilllliiilll.method_22683().method_4489();
         float var30 = (float)Iiiilllliiilll.method_22683().method_4506();
         if (!(var29 < 1.0F) && !(var30 < 1.0F)) {
            float var31 = (float)((double)var29 / var27);
            float var32 = (float)((double)var30 / var27);
            float var33 = (float)((double)(now - this.IIIllliill) / 1.0E9 % 3600.0);
            float var34 = IlIIIillIIIi.IliIlllilIi(var19 * 1.35F + 0.12F + var23 * 0.05F, 0.14F, 0.62F);
            long var35 = System.nanoTime();
            if (IlIIIillIIIi.IIlilIliiIli(this.llIllliill)) {
               this.IIllllIlll(var31, var32, var19, var20, var24, this.iIIllliill, var10);
               boolean var37 = true;
            } else {
               boolean var38 = liiiIlIliiiiIlIl.iIlIlllllill(
                  var31,
                  var32,
                  var29,
                  var30,
                  var12,
                  var13,
                  var14,
                  var15,
                  var16,
                  var17,
                  var18,
                  var33,
                  var20,
                  var19,
                  var21,
                  var22,
                  var23,
                  var24,
                  var25,
                  (float)var26,
                  this.iIIllliill,
                  var34
               );
               if (var38) {
                  this.IlIllliill = 0;
                  boolean var41 = true;
               } else {
                  this.IlIllliill++;
                  if (IlIIIillIIIi.IiIiliIiiiIi(this.IlIllliill)) {
                     this.llIllliill = true;
                     if (this.ilIllliill.IliIlllilIi()) {
                        System.err.println(IliIlllilIi<"IliIlllilIi","EtzgqGvmgP3DSL1cTBLSTk5bt5orTtjOhdpntLGk">());
                        System.err.flush();
                     }

                     this.IIllllIlll(var31, var32, var19, var20, var24, this.iIIllliill, var10);
                     boolean var42 = true;
                  } else {
                     boolean var43 = false;
                  }
               }
            }

            long var44 = (System.nanoTime() - var35) / 1000L;
         }
      }
   }

   public Iiiilillliiilill() {
      super(IliIlllilIi<"IliIlllilIi","P4VFYHuzdzFkAFrASzJvh8xv+9w1QFQKVGVWrkjicQjRyjdyFXokKQ==">(), lllIllillIll.llIlIIIiilIlIIIi);
      this.illIlliill = new iliiliilIiiiliil(
         IliIlllilIi<"IliIlllilIi","aq5eR76jfM6MnZLB20Nw6ufisB0MEYnlev7zxzIugX/g/VvjsST0q1CoZQ==">(),
         IliIlllilIi<"IliIlllilIi","ZD6gqd+5fYCgG0i+Mfvr0ZlF1CIBPsAAeodDveZ2kU7PVG36KlH3ykX2+HIxJ0IKlpkaKW83TLZayjGr8iDkJg37FCzhQ3n/aXIi5VNhTiKqGDoUeg==">(),
         -15798
      );
      this.IilIlliill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","XzCFiHE6AoMAnWfU/Rn5ccJGqKr0uYALf7lHODPSc5AIkJWI/3USwjjmmrpZHJIz">(),
         IliIlllilIi<"IliIlllilIi","BTK1QzhkuuarXDi82KEjRaOm5fvy3GjLpo6oAT9jHVAjpuZkN50FQKQ+sHik9oysD5Bd1LdvxX34ioCSvaaQ6O+OEj6aHxT4EQ==">(),
         true
      );
      this.lilIlliill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","zBvDF9jSrE1hpIPa4EgGkwchVw5GOiVfZXkLflkFtB2X6ylaA6czKA==">(),
         IliIlllilIi<"IliIlllilIi","BdCAPW1V9ImG9cJxpmyiga79IiU4cJUoDzywSAssY13g798bhtWdqPHjxCIumIQL+DjGAo1E/N2UMB0vSqb7Zc71obOxPmlZ2HoOv4bfx8anR4GmZ98Lystfi+p4813bnQ==">(),
         0.18,
         0.08,
         0.35,
         0.01
      );
      this.iilIlliill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","Yer8Cc2s5WnHI4otAj04defvst0lrac19sFfX0ErF4a0yzs=">(),
         IliIlllilIi<"IliIlllilIi","83+7Ba+seQInIKuzY5yUBLyb1R4yM/VN7n5HofCTy62DrL5lV+LT6ZUFrqMJnlvE3A==">(),
         0.55,
         0.1,
         1.0,
         0.05
      );
      this.IIiIlliill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","L+ZzpsTcyECtMq+oHxSaD8Z6pLazGf4JlJDzXZ/vmG26uw5/5ZKXeqp1xQ==">(),
         IliIlllilIi<"IliIlllilIi","6HqTT9GgMxa0ACIQL16xXVWkHs68Z1go3yBvcZAV4YnYhB1GrnwnHj1Aar8M+kdH">(),
         1.0,
         0.2,
         2.5,
         0.05
      );
      this.lIiIlliill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","Zp13qiedjFD8izPyi1pRf/pOBggiuSgMU2M2tT5JBmdNSqFlWvaWWgPnVw==">(),
         IliIlllilIi<"IliIlllilIi","my1ZmdysSYa3+tUT+HRKUk/LEsOXaPXqv8Fr4gPqaeduUJTAngS0Y6xUkD3PUfoBAcrziultTt+f">(),
         0.75,
         0.2,
         1.5,
         0.05
      );
      this.iIiIlliill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","FGYnt77R3GhEjfmQLRFJnKpzMkPb8E3XZ0B62tQYYpHnvufXAQ==">(),
         IliIlllilIi<"IliIlllilIi","/SdnlmDQerJ1zSTtS2QuCPT8m3QtMHST2a7idAwYkoQbD2QW78adzmMCVohQGjqOuhkizc3luvkftidtfqc0DtSO6jYuEqp8+tRBIUh11AENiwnRLfcmX8A=">(),
         0.2,
         0.0,
         1.0,
         0.05
      );
      this.IliIlliill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","/lfSIOxFTie8yQx1EOBeTvdtu25nH8P3PlWz/5BBfjJwUx25DktKWQ==">(),
         IliIlllilIi<"IliIlllilIi","qr4aJJ3m0KF8cVHIBjNg5utLm+Xd3YGf0JPxcQ1/Ru4w07mYvFkMTl12Yfe+ToUdheuWgfJSONFTNWYW3rE8yj6rTZuXPNyXA1e5KsdMKvxDm62Y">(),
         0.55,
         0.2,
         0.8,
         0.05
      );
      this.lliIlliill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","fHDcZEOo3q18+iay0OqVQCkkWEsGaSpffhZoOHrTnaOTJapvyRc0">(),
         IliIlllilIi<"IliIlllilIi","r+U6XOZKBn1eFQjbVqfOiP3tS61utG+n5R7RNZ+V6IkkFvLDjuUJDst579a4fJiasWS/eqnCiBfHReLXFlhk+XX38MaZ59E=">(),
         0.35,
         0.0,
         1.0,
         0.05
      );
      this.iliIlliill = new lliliIIiililiIIi(
         IliIlllilIi<"IliIlllilIi","fJ55+FG+DOAQzoJz0xeLyAFd7dZqCdAAHvJQDDz/eyCC">(),
         IliIlllilIi<"IliIlllilIi","k9zeFVnkBfbg8hjBUuWpI+ymt8Nhlbeb9SikxQJLjq5yz/ctjtw=">(),
         IliIlllilIi<"IliIlllilIi","MI2Q0n49SVSmwVHpH4aOx17pHRrjD+kQYwhasvrfSGO/Qg==">(),
         IlIIIillIIIi.ilIIlliiIiIIllii
      );
      this.IiiIlliill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","pVBxmhgE9dgL/D+SlB/Rn8ffUGR55xBaghwue1OeGfgDsBxv5JotIu0M2Mn2">(),
         IliIlllilIi<"IliIlllilIi","caBRYeyzTEA4TL6tQIJwnClVVcde6PVh4ZAsZCcqLAGRjg+a1dBDWCxma/Fg3wzrJR2x8hRG/l1I/myonnGvY71Fwfmufan45yZIbvTePFayaP0HZ3TyiBvdsAPWX1IVGmg=">(),
         true
      );
      this.liiIlliill = new iiIiiilIIliiil(
         IliIlllilIi<"IliIlllilIi","1Oj/pH6H+JlkaPgpWYPZjNIXeUM91a/GJX3M0BbbPtkBU5NyK1PbGfwiuTGu3w==">(),
         IliIlllilIi<"IliIlllilIi","Y1Jld6vbzLJn1atA1gZ0fNyiii4dLuLBF10lIO/nbVPLLkuC6OSI90fHzJ8nC0bkQ7KuoGXwIvHUfwzTEMvyBTpWggUZ3dO6EXY/7FBNrM/ZsM/jQNe13Gk3CYl/hHEfSXk=">(),
         true
      );
      this.iiiIlliill = new IIIIlilllIIIlill(
         IliIlllilIi<"IliIlllilIi","tmb9jTnW/qXgs2NHtNDvaUwvQeB95EganS3uc4mB4f3rZvPZ0vb71yF2BQmXpw==">(),
         IliIlllilIi<"IliIlllilIi","fpeQogTTXvnARBZWgkj81i8pLbMMNDtGKhFhlADW7+2/Y1wcz4mMTZTbL3V8Bo8toT5m0qTI0hSOIE54G40ai8Mq">(),
         1.0,
         0.3,
         1.6,
         0.1
      );
      this.IIIllliill = System.nanoTime();
      this.lIIllliill = 0L;
      this.iIIllliill = 0.0F;
      this.IlIllliill = 0;
      this.llIllliill = false;
      this.ilIllliill = new ilIIliIlIiIIliIl();
      this.IiIllliill = 0L;
      this.liIllliill = new ArrayList<>();
      this.iiIllliill = 0;
      this.IIlllliill = false;
      this.Iilllliill = new int[60];
      this.lilllliill = new float[15];
      this.IlIlllIlilIl(
         new IilliIllilliIl[]{
            this.lllIlliill,
            this.illIlliill,
            this.IilIlliill,
            this.lilIlliill,
            this.iilIlliill,
            this.IIiIlliill,
            this.lIiIlliill,
            this.iIiIlliill,
            this.IliIlliill,
            this.lliIlliill,
            this.iliIlliill,
            this.IiiIlliill,
            this.liiIlliill,
            this.iiiIlliill
         }
      );
   }

   @Override
   public void iIIIlIlIIl() {
      this.IlIllllIll();
      if (lIIlliIIll() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (--this.iiIllliill <= 0) {
            this.iiIllliill = 6;
            this.ilIllIiIll();
         }
      } else {
         if (!this.liIllliill.isEmpty()) {
            this.liIllliill.clear();
         }
      }
   }

   @Override
   protected void Iilililiiili() {
      this.iIIllliill = 0.0F;
      this.lIIllliill = 0L;
      this.liIllliill.clear();
      this.IlIllllIll();
   }

   private void IIllllIlll(float argb, float scaledW, float fade, float center, float height, float scaledH, int opacity) {
      byte var8 = 6;
      float var9 = fade * 0.9F;
      float var10 = scaledW * var9 / 6.0F;
      float var11 = IlIIIillIIIi.IliIlllilIi(center * scaledH, 0.0F, 1.0F);
      int var12 = opacity >> 16 & 0xFF;
      int var13 = opacity >> 8 & 0xFF;
      int var14 = opacity & 0xFF;
      float var15 = argb * 0.5F;
      float var16 = argb * (0.1F + height * 0.18F);
      class_4588 var17 = llIllIililIllIil.IilliliilIIi();

      for (int var18 = 0; var18 < 6; var18++) {
         float var19 = scaledW - (float)var18 * var10;
         float var20 = scaledW - (float)(var18 + 1) * var10;
         int var21 = Math.round(var11 * (1.0F - (float)var18 / 6.0F) * 255.0F);
         var21 = var21 < 0 ? 0 : (var21 > 255 ? 255 : var21);
         int var22 = var21 << 24 | var12 << 16 | var13 << 8 | var14;
         llIllIililIllIil.iliIiiliiiii(var17, 0.0F, var20, var15 - var16, var19, var22);
         llIllIililIllIil.iliIiiliiiii(var17, var15 + var16, var20, argb, var19, var22);
      }

      llIllIililIllIil.IIillIiliIil();
   }

   private void ilIllIiIll() {
      this.liIllliill.clear();
      class_2338 var1 = Iiiilllliiilll.field_1724.method_24515();
      byte var2 = 18;
      byte var3 = 8;
      short var4 = 256;
      class_2339 var5 = new class_2339();

      for (int var6 = -18; var6 <= 18; var6++) {
         for (int var7 = -18; var7 <= 18; var7++) {
            for (int var8 = -8; var8 <= 8; var8++) {
               var5.method_10103(var1.method_10263() + var6, var1.method_10264() + var8, var1.method_10260() + var7);
               if (Iiiilllliiilll.field_1687.method_8320(var5).method_26204() instanceof class_4770) {
                  this.liIllliill.add(var5.method_10062());
                  if (this.liIllliill.size() >= 256) {
                     return;
                  }
               }
            }
         }
      }
   }

   private void IlIllllIll() {
      long var2 = -6402554158397694900L;
      var2 ^= ((long)lIIlliIIll() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != this.IIlllliill) {
         this.IIlllliill = (boolean)((int)(var2 >>> 32));
         if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1769 != null) {
            Iiiilllliiilll.field_1769.method_3279();
         }
      }
   }

   public static boolean lIIlliIIll() {
      Iiiilillliiilill var0 = (Iiiilillliiilill)llilIllililIll.iliIiiliiiii(Iiiilillliiilill.class);
      return var0 != null && var0.IliIlllilIi() && var0.liiIlliill.Iilllilliill();
   }
}
