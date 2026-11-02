package gg.corz;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import net.minecraft.class_10055;
import net.minecraft.class_11659;
import net.minecraft.class_11890;
import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4050;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4608;
import net.minecraft.class_630;
import net.minecraft.class_742;
import net.minecraft.class_4587.class_4665;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class iiiliiIiIIIiiiIi {
   private static final float IIillIIlIi = 10.240001F;
   private static final Set<String> liillIIlIi = new HashSet<>();
   private static final Vector3f IlIilIIlIi = new Vector3f();
   private static final Vector3f iIIilIIlIi = new Vector3f();
   private static final float lilllIIlIi = 1.501F;
   private static final float iilllIIlIi = 2.1333334F;
   private static final float ilillIIlIi = 12.0F;
   private static final float IilllIIlIi = 0.0625F;
   private static final float IlillIIlIi = (float) (Math.PI / 180.0);
   private static final double iIillIIlIi = 576.0;
   private static final Map<liIlilIiiiIlilIi, float[]> IIIilIIlIi = new IdentityHashMap<>();
   private static final float IiillIIlIi = 2.0F;
   private static final Map<liIlilIiiiIlilIi, float[]> lIIilIIlIi = new IdentityHashMap<>();
   private static final Map<liIlilIiiiIlilIi, IIlllilllIlllill> iiillIIlIi = new IdentityHashMap<>();
   private static final double lIillIIlIi = 64.0;
   private static final RenderStateDataKey<iiillIIlIIIilIIl> illllIIlIi = RenderStateDataKey.create(
      () -> Illillliilli<"Illillliilli","vVMnO5gfaUeLA0JlAh6kKvWoqzH3T4JC5i87ggFYL9oDJKYe2zpmdLQ=">()
   );
   private static final float llillIIlIi = 10.0F;

   private static float[] IlIlllIlilIl(llllIlilllIl c, liIlilIiiiIlilIi m, iiiIlIIIll a) {
      IIlllilllIlllill var3 = iiillIIlIi.computeIfAbsent(m, liIlilIiiiIlilIi::IliIlllilIi);
      var3.IliIlllilIi();
      c.lIiiIiIlilli(a, var3);
      float[] var4 = m.liiiIIllIl();
      m.iliIiiliiiii(var3, var4);
      return var4;
   }

   private static void Iilllilliill(llllIlilllIl t, String c, Throwable where) {
      if (liillIIlIi.add(t.IliIlllilIi())) {
         try {
            Iliiiiilliiiii.IliIlllilIi()
               .iIlIlllllill(
                  Illillliilli<"Illillliilli","ezltujAUOYSTv0XO7v88a/LpmIiuiMl/TD7vFaZuDxz0rTXIusnW">(),
                  t.liiiIIllIl() + Illillliilli<"Illillliilli","0TqznrZhUk+DXt5TIJSSpVCXDkJSMzAWLuy8fi6LDmu3wnFWTeCjgFD2ieysNbUmLrxhJKIVcqx3hGL7CreULSzS">(),
                  false
               );
         } catch (Throwable var4) {
         }
      }
   }

   public static boolean lIiiIiIlilli(
      class_11659 matrices, class_10055 s, class_4587 light, class_1921 vanillaLayer, int overlay, int queue, int color, int outline
   ) {
      long var20 = -1992115154191781480L;
      long var22 = 7685849535356505963L;
      iiillIIlIIIilIIl var8 = (iiillIIlIIIilIIl)s.getData(illllIIlIi);
      if (var8 == null) {
         return false;
      } else {
         llllIlilllIl var9 = var8.IlliiillIl;
         if (liillIIlIi.contains(var9.IliIlllilIi())) {
            return false;
         } else {
            try {
               liIlilIiiiIlilIi var10 = var9.Illlllllilll();
               if (var10 == null) {
                  return false;
               } else {
                  liIlilIiiiIlilIi var11 = iliIiiliiiii(var9, var10, var8);
                  var8.llliiillIl.liilllliiillll = -s.field_53447 * (float) (Math.PI / 180.0);
                  var8.llliiillIl.IIIillllIIilll = -s.field_53448 * (float) (Math.PI / 180.0);
                  class_2960 var12 = lIIlIIliiIIlIIli.IliIlllilIi(var9, var10);
                  float[] var13 = IlIlllIlilIl(var9, var11, var8.llliiillIl);
                  var20 ^= ((long)(vanillaLayer != null && vanillaLayer.method_24295() ? 1 : 0) << 32 ^ var20) & -1L << 32;
                  var20 ^= ((long)(color >>> 24 < 255 ? 1 : 0) ^ var20) & -1L >>> 32;
                  class_1921 var16 = (int)(var20 >>> 32) != 0
                     ? class_12249.method_76018(var12)
                     : ((int)var20 != 0 ? class_12249.method_76000(var12) : class_12249.method_75994(var12));
                  light.method_22903();

                  try {
                     light.method_46416(0.0F, 1.501F, 0.0F);
                     light.method_22905(-0.0625F, -0.0625F, 0.0625F);
                     if (!s.field_53455) {
                        if (s.field_53410) {
                           light.method_46416(0.0F, 2.1333334F, 0.0F);
                        }

                        if (s.field_53413) {
                           light.method_46416(0.0F, -Math.max(0.0F, var9.IiIlliIliiIl(var10) - 10.240001F), 0.0F);
                        }
                     }

                     if ((int)(var20 >>> 32) != 0) {
                        var22 ^= ((long)(outline != 0 ? outline : color) << 32 ^ var22) & -1L << 32;
                        matrices.method_73483(light, var16, (mats, m) -> IIlllIlliIll(var9, var11, var13, mats, m, tint));
                        var22 ^= (1L ^ var22) & -1L >>> 32;
                        return (boolean)((int)var22);
                     }

                     matrices.method_73483(light, var16, (m, colorx) -> IiIlliIliiIl(var9, var11, var13, -1, m, colorx, color, overlay, queue));
                     if (outline != 0) {
                        Optional var17 = var16.method_23289();
                        if (var17.isPresent()) {
                           matrices.method_73483(light, (class_1921)var17.get(), (vc, c) -> IIlllIlliIll(var9, var11, var13, vc, c, outline));
                        }
                     }
                  } finally {
                     light.method_22909();
                  }

                  return true;
               }
            } catch (Throwable var27) {
               Iilllilliill(var9, Illillliilli<"Illillliilli","RzEhnCRQA3nncQuFhJzHw6Pi9ICYGklQjw10qfcZI+ZO+A==">(), var27);
               return false;
            }
         }
      }
   }

   static float[] liiiIIllIl(float reach) {
      if (!(reach <= 0.0F) && !(reach >= 10.0F)) {
         float var1 = Math.min(2.0F, 10.0F / reach);
         return new float[]{var1, 12.0F - reach * var1};
      } else {
         return new float[]{1.0F, 0.0F};
      }
   }

   public static boolean IilliliilIIi(class_10055 s) {
      return !s.field_53333 && s.getData(illllIIlIi) != null;
   }

   public static void IliIlllilIi() {
      liillIIlIi.clear();
      iiillIIlIi.clear();
      IIIilIIlIi.clear();
      lIIilIIlIi.clear();
   }

   private static liIlilIiiiIlilIi iliIiiliiiii(llllIlilllIl c, liIlilIiiiIlilIi near, iiillIIlIIIilIIl f) {
      if (!f.IiliiillIl && !(f.illiiillIl <= 64.0)) {
         liIlilIiiiIlilIi var3 = c.Iilllilliill();
         if (var3 == null) {
            return near;
         } else if (f.illiiillIl <= 576.0) {
            return var3;
         } else {
            liIlilIiiiIlilIi var4 = c.IIillIiliIil();
            return var4 != null ? var4 : var3;
         }
      } else {
         return near;
      }
   }

   private static void IiIlliIliiIl(
      llllIlilllIl light, liIlilIiiiIlilIi m, float[] subtree, int overlay, class_4665 c, class_4588 entry, int tint, int vc, int mats
   ) {
      long var43 = 1483927577689445362L;
      long var45 = 425793449626148414L;
      long var47 = 3126938898790823252L;

      try {
         Matrix4f var9 = c.method_23761();
         var43 ^= ((long)(tint != -1 ? 1 : 0) << 32 ^ var43) & -1L << 32;

         for (long var51 = var43 ^ (0L ^ var43) & -1L >>> 32; (int)var51 < m.IiIilllIIi; var51 ^= (var51 ^ var51 + (long)1) & -1L >>> 32) {
            if (overlay < 0 || m.IilliliilIIi((int)var51, overlay)) {
               float[] var12 = m.lIlilllIIi[(int)var51];
               if (var12.length != 0) {
                  var45 ^= ((long)((int)var51 * 21) << 32 ^ var45) & -1L << 32;
                  float var14 = subtree[(int)(var45 >>> 32)];
                  float var15 = subtree[(int)(var45 >>> 32) + 1];
                  float var16 = subtree[(int)(var45 >>> 32) + 2];
                  float var17 = subtree[(int)(var45 >>> 32) + 3];
                  float var18 = subtree[(int)(var45 >>> 32) + 4];
                  float var19 = subtree[(int)(var45 >>> 32) + 5];
                  float var20 = subtree[(int)(var45 >>> 32) + 6];
                  float var21 = subtree[(int)(var45 >>> 32) + 7];
                  float var22 = subtree[(int)(var45 >>> 32) + 8];
                  float var23 = subtree[(int)(var45 >>> 32) + 9];
                  float var24 = subtree[(int)(var45 >>> 32) + 10];
                  float var25 = subtree[(int)(var45 >>> 32) + 11];
                  float var26 = subtree[(int)(var45 >>> 32) + 12];
                  float var27 = subtree[(int)(var45 >>> 32) + 13];
                  float var28 = subtree[(int)(var45 >>> 32) + 14];
                  float var29 = subtree[(int)(var45 >>> 32) + 15];
                  float var30 = subtree[(int)(var45 >>> 32) + 16];
                  float var31 = subtree[(int)(var45 >>> 32) + 17];
                  float var32 = subtree[(int)(var45 >>> 32) + 18];
                  float var33 = subtree[(int)(var45 >>> 32) + 19];
                  float var34 = subtree[(int)(var45 >>> 32) + 20];

                  for (var45 ^= (0L ^ var45) & -1L >>> 32; (int)var45 < var12.length; var45 ^= (var45 ^ var45 + (long)9) & -1L >>> 32) {
                     float var36 = var12[(int)var45];
                     float var37 = var12[(int)var45 + 1];
                     float var38 = var12[(int)var45 + 2];
                     var9.transformPosition(
                        var14 * var36 + var15 * var37 + var16 * var38 + var17,
                        var18 * var36 + var19 * var37 + var20 * var38 + var21,
                        var22 * var36 + var23 * var37 + var24 * var38 + var25,
                        iIIilIIlIi
                     );
                     float var39 = var12[(int)var45 + 5];
                     float var40 = var12[(int)var45 + 6];
                     float var41 = var12[(int)var45 + 7];
                     c.method_56820(
                        var26 * var39 + var27 * var40 + var28 * var41,
                        var29 * var39 + var30 * var40 + var31 * var41,
                        var32 * var39 + var33 * var40 + var34 * var41,
                        IlIilIIlIi
                     );
                     var47 ^= ((long)liIllliliiIlllil.IilliliilIIi(var12, (int)var45) << 32 ^ var47) & -1L << 32;
                     if ((int)(var51 >>> 32) != 0) {
                        var47 ^= ((long)Illlllllilll((int)(var47 >>> 32), tint) << 32 ^ var47) & -1L << 32;
                     }

                     entry.method_23919(
                        iIIilIIlIi.x,
                        iIIilIIlIi.y,
                        iIIilIIlIi.z,
                        (int)(var47 >>> 32),
                        var12[(int)var45 + 3],
                        var12[(int)var45 + 4],
                        mats,
                        vc,
                        IlIilIIlIi.x,
                        IlIilIIlIi.y,
                        IlIilIIlIi.z
                     );
                  }
               }
            }
         }
      } catch (Throwable var49) {
         Iilllilliill(light, Illillliilli<"Illillliilli","N4zCD9aojdNE80dK7iF+5H4OhVjCtiZJjsBKk2wl+2E=">(), var49);
      }
   }

   private iiiliiIiIIIiiiIi() {
   }

   public static boolean IIIllIIliIIl(class_11659 part, class_630 matrices, class_4587 queue, int light, boolean right) {
      long var13 = 3439428878912718398L;
      class_310 var5 = class_310.method_1551();
      if (var5.field_1724 == null) {
         return false;
      } else {
         llllIlilllIl var6 = IiiIiiIlliiIiiIl.liIlliiIll(var5.field_1724);
         if (var6 != null && !liillIIlIi.contains(var6.IliIlllilIi())) {
            try {
               liIlilIiiiIlilIi var7 = var6.Illlllllilll();
               if (var7 == null) {
                  var6.IIlllIlliIll();
                  return false;
               } else {
                  var13 ^= ((long)var7.IllilllIIi << 32 ^ var13) & -1L << 32;
                  if ((int)(var13 >>> 32) < 0) {
                     return true;
                  } else {
                     class_2960 var9 = lIIlIIliiIIlIIli.IliIlllilIi(var6, var7);
                     float[] var10 = IIIilIIlIi.computeIfAbsent(var7, k -> {
                        float[] var1 = k.liiiIIllIl();
                        k.iliIiiliiiii(k.IliIlllilIi(), var1);
                        return var1;
                     });
                     float[] var11 = lIIilIIlIi.computeIfAbsent(var7, k -> liiiIIllIl(k.lIiiIiIlilli()));
                     queue.method_22903();

                     try {
                        matrices.method_22703(queue);
                        queue.method_22905(right ? -0.0625F : 0.0625F, -0.0625F, 0.0625F);
                        queue.method_46416(0.0F, -var11[1], 0.0F);
                        queue.method_22905(var11[0], var11[0], var11[0]);
                        queue.method_46416(
                           -var7.IIlilllIIi[3 * (int)(var13 >>> 32)],
                           -var7.IIlilllIIi[3 * (int)(var13 >>> 32) + 1],
                           -var7.IIlilllIIi[3 * (int)(var13 >>> 32) + 2]
                        );
                        part.method_73483(
                           queue, class_12249.method_75994(var9), (m, arm) -> IiIlliIliiIl(var6, var7, var10, c, m, arm, -1, light, class_4608.field_21444)
                        );
                     } finally {
                        queue.method_22909();
                     }

                     return true;
                  }
               }
            } catch (Throwable var18) {
               Iilllilliill(var6, Illillliilli<"Illillliilli","EXOniuop+4YZL51BBZBSceHisatnNiqXa7G/Z93ZRIFNGRzIh3382w==">(), var18);
               return false;
            }
         } else {
            return false;
         }
      }
   }

   private static int Illlllllilll(int a, int b) {
      long var6 = 1354869443227392708L;
      long var8 = -2727846813876338037L;
      var6 ^= ((long)((a >>> 24) * (b >>> 24) / 255) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)((a >> 16 & 0xFF) * (b >> 16 & 0xFF) / 255) ^ var6) & -1L >>> 32;
      var8 ^= ((long)((a >> 8 & 0xFF) * (b >> 8 & 0xFF) / 255) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)((a & 0xFF) * (b & 0xFF) / 255) ^ var8) & -1L >>> 32;
      return (int)(var6 >>> 32) << 24 | (int)var6 << 16 | (int)(var8 >>> 32) << 8 | (int)var8;
   }

   public static void iIlIlllllill(class_11890 entity, class_10055 s) {
      try {
         if (s.getData(illllIIlIi) != null) {
            s.setData(illllIIlIi, null);
         }

         if (!(entity instanceof class_742 var2)) {
            return;
         }

         llllIlilllIl var3 = IiiIiiIlliiIiiIl.liIlliiIll(var2);
         if (var3 == null || liillIIlIi.contains(var3.IliIlllilIi())) {
            return;
         }

         if (var3.Illlllllilll() == null) {
            var3.IIlllIlliIll();
            return;
         }

         iiillIIlIIIilIIl var4 = new iiillIIlIIIilIIl(var3);
         iiiIlIIIll var5 = var4.llliiillIl;
         var5.lIilllliIillll = s.field_53328;
         var5.Ilillllllillll = s.field_53450;
         var5.ilillllIiillll = Math.min(1.0F, Math.max(0.0F, s.field_53451));
         var5.iIIilllIlIilll = s.field_63604;
         var5.llIilllilIilll = s.field_53403;
         var5.IiIilllliIilll = s.field_53410;
         var5.iiIilllIIlilll = s.field_53411;
         var5.lIlillliIlilll = s.field_53412;
         var5.Illillllllilll = s.field_53413;
         var5.illilllIililll = s.method_62613(class_4050.field_18078);
         var5.lilillliililll = s.field_53414;
         var5.IIiillllIiilll = s.field_53460;
         var5.lliillliliilll = var2.method_5667().hashCode();
         var4.IiliiillIl = var2 == class_310.method_1551().field_1724;
         if (var4.IiliiillIl && IiiIiiIlliiIiiIl.IlliIlIlll >= 0) {
            var5.iIiilllIliilll = true;
            var5.ilillllIiillll = 0.0F;
            var5.iIIilllIlIilll = 0.0F;
         }

         var4.illiiillIl = s.field_53332;
         s.setData(illllIIlIi, var4);
      } catch (Throwable var6) {
      }
   }

   private static void IIlllIlliIll(llllIlilllIl entry, liIlilIiiiIlilIi c, float[] outline, class_4665 mats, class_4588 m, int vc) {
      long var16 = 5415618603743583450L;
      long var14 = 5140225224222998465L;

      try {
         Matrix4f var6 = mats.method_23761();
         var14 ^= (0L ^ var14) & -1L << 32;

         while ((int)(var14 >>> 32) < c.IiIilllIIi) {
            float[] var8 = c.lIlilllIIi[(int)(var14 >>> 32)];
            var14 ^= ((long)((int)(var14 >>> 32) * 21) ^ var14) & -1L >>> 32;

            for (var16 ^= (0L ^ var16) & -1L << 32; (int)(var16 >>> 32) < var8.length; var16 += 38654705664L) {
               float var11 = var8[(int)(var16 >>> 32)];
               float var12 = var8[(int)(var16 >>> 32) + 1];
               float var13 = var8[(int)(var16 >>> 32) + 2];
               var6.transformPosition(
                  outline[(int)var14] * var11 + outline[(int)var14 + 1] * var12 + outline[(int)var14 + 2] * var13 + outline[(int)var14 + 3],
                  outline[(int)var14 + 4] * var11 + outline[(int)var14 + 5] * var12 + outline[(int)var14 + 6] * var13 + outline[(int)var14 + 7],
                  outline[(int)var14 + 8] * var11 + outline[(int)var14 + 9] * var12 + outline[(int)var14 + 10] * var13 + outline[(int)var14 + 11],
                  iIIilIIlIi
               );
               m.method_22912(iIIilIIlIi.x, iIIilIIlIi.y, iIIilIIlIi.z)
                  .method_39415(vc)
                  .method_22913(var8[(int)(var16 >>> 32) + 3], var8[(int)(var16 >>> 32) + 4]);
            }

            var14 += 4294967296L;
         }
      } catch (Throwable var18) {
         Iilllilliill(entry, Illillliilli<"Illillliilli","Q37aCLV1zkpHHo2yohGJN+Mcug5vc22bsCAmUVmVoov/eEo=">(), var18);
      }
   }
}
