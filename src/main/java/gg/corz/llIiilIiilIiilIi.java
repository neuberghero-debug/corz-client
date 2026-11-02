package gg.corz;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_11659;
import net.minecraft.class_1921;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4608;
import net.minecraft.class_4587.class_4665;
import org.joml.Matrix4f;

public final class llIiilIiilIiilIi {
   public static final float lIllillIIi = 0.2F;
   private static final Matrix4f lillillIIi = new Matrix4f();
   private static final Set<iiIiliiIIlilii> IlllillIIi = EnumSet.noneOf(iiIiliiIIlilii.class);
   private static final Matrix4f illlillIIi = new Matrix4f();
   private static final Map<iiIiliiIIlilii, IIIiIlIilIIiIlIi> iIllillIIi = new EnumMap<>(iiIiliiIIlilii.class);
   private static final Matrix4f llllillIIi = new Matrix4f();
   private static final Matrix4f IillillIIi = new Matrix4f();
   private static final float IIllillIIi = 1.0E-10F;
   private static final float iiIlillIIi = 0.033333335F;

   public static float IlIillIiilIi(float time, float length) {
      float var2;
      if (time < 0.0F) {
         var2 = 1.0F + time / 0.2F;
      } else {
         if (!(time > length)) {
            return 1.0F;
         }

         var2 = 1.0F - (time - length) / 0.2F;
      }

      var2 = Math.max(0.0F, Math.min(1.0F, var2));
      return var2 * var2 * (3.0F - 2.0F * var2);
   }

   public static List<String> IiIlliIliiIl(iiIiliiIIlilii knife) {
      IIIiIlIilIIiIlIi var1 = lIiiIiIlilli(knife) ? iIllillIIi.get(knife) : null;
      return var1 == null ? List.of() : var1.ilIllIIIIi;
   }

   public static List<iIiiiilIliiiil> Iilllilliill(String clip) {
      return IIillIiliIil(iiIiliiIIlilii.lIIllliIIl, clip);
   }

   private static boolean liiiIIllIl(lIIiilIliIIiilIl root, int model, int except) {
      for (int var3 = 0; var3 < root.liiililIll.length; var3++) {
         if (root.liiililIll[var3].lIiiIiIlilli().length != 0 && root.IIlllIlliIll(var3, model) && (except < 0 || !root.IIlllIlliIll(except, var3))) {
            return true;
         }
      }

      return false;
   }

   public static float Illlllllilll(iiIiliiIIlilii clip, String knife) {
      lliIiiililiIiiil var2 = IIIilIIiiIIi(clip, knife);
      return var2 == null ? 0.0F : var2.iIlIlllllill();
   }

   public static boolean IiIiliIiiiIi(class_4587 light, class_11659 matrices, lIIllIiiIIllIi queue, String clipName, float twirl, boolean finish, int time) {
      return IIlilIliiIli(iiIiliiIIlilii.lIIllliIIl, light, matrices, queue, clipName, twirl, finish, time);
   }

   public static boolean Iilililiiili(lIIllIiiIIllIi finish) {
      return finish != null && !finish.IliIlllilIi() ? iiiIIlllIIIlIlll.liiiIIllIl(illIIlllIilIIlll.iiIIIIIill, finish) != null : true;
   }

   public static List<iIiiiilIliiiil> IIillIiliIil(iiIiliiIIlilii clip, String knife) {
      lliIiiililiIiiil var2 = IIIilIIiiIIi(clip, knife);
      if (var2 == null) {
         return List.of();
      } else {
         List var3 = IillIlilillIli.IiIiliIiiiIi(clip, var2);
         return var3 != null ? var3 : IllIiiillllIiiil.IliIlllilIi(iIllillIIi.get(clip).IIIllIIIIi, var2);
      }
   }

   public static boolean lIiiIiIlilli(iiIiliiIIlilii knife) {
      return iIlIlllllill(knife) != null;
   }

   private static IIIiIlIilIIiIlIi iIlIlllllill(iiIiliiIIlilii knife) {
      if (knife == null) {
         return null;
      } else {
         iIllliIlllli.iIlIlllllill(knife);
         liIlIiliiIlIil var1 = iIllliIlllli.iliIiiliiiii(knife);
         if (var1 == null) {
            return null;
         } else {
            IIIiIlIilIIiIlIi var2 = iIllillIIi.get(knife);
            if (var2 == null || var2.iiiIlIIIIi != var1) {
               if (IlllillIIi.contains(knife)) {
                  return null;
               }

               try {
                  var2 = new IIIiIlIilIIiIlIi(var1);
               } catch (RuntimeException var4) {
                  IlllillIIi.add(knife);
                  System.err
                     .println(
                        iIIIlIlIIl<"iIIIlIlIIl","bm6tVKuCJ4iQT+lcYDS/mWAJK0cU7qR4D6ZCYimx">()
                           + knife.lililliIIl
                           + iIIIlIlIIl<"iIIIlIlIIl","DLw6+mR/TEyzzvwivVbHIfzr6KfBGvr5Ewmxev5pt49XhlBMnYJ+FEatPI/EmVB+84o=">()
                           + var4
                     );
                  return null;
               }

               iIllillIIi.put(knife, var2);
            }

            return var2;
         }
      }
   }

   private static void Illillliilli(float[] v, class_4665 light, class_4588 out, int m) {
      for (byte var4 = 0; var4 < v.length; var4 += 8) {
         out.method_56824(light, v[var4], v[var4 + 1], v[var4 + 2])
            .method_39415(-1)
            .method_22913(v[var4 + 3], v[var4 + 4])
            .method_22922(class_4608.field_21444)
            .method_60803(m)
            .method_60831(light, v[var4 + 5], v[var4 + 6], v[var4 + 7]);
      }
   }

   public static boolean iliIiiliiiii() {
      return IIIllIIliIIl(iiIiliiIIlilii.lIIllliIIl);
   }

   private static lliIiiililiIiiil IIIilIIiiIIi(iiIiliiIIlilii name, String knife) {
      return lIiiIiIlilli(name) && knife != null ? iIllillIIi.get(name).IIIllIIIIi.iiiililIll.get(knife) : null;
   }

   public static float Iiilliiliiil(iiIiliiIIlilii knife) {
      IIIiIlIilIIiIlIi var1 = lIiiIiIlilli(knife) ? iIllillIIi.get(knife) : null;
      return var1 == null ? 1.0F : var1.iIlllIIIIi;
   }

   private static boolean IIiilIiiiIii(lIIiilIliIIiilIl queue, Matrix4f[] matrices, class_4587 bones, class_11659 finish, int light, lllIlIlillIlIl model) {
      int var6 = lIiiiIiiIiiiIi.IlilIliiillilIliii.length;
      Matrix4f[] var7 = IIililIili.lIiiIiIlilli(queue);

      for (int var8 = 0; var8 < var6; var8++) {
         IIIiIllllIIiIlll var9 = IIIiIllllIIiIlll.iliIiiliiiii(lIiiiIiiIiiiIi.IlilIliiillilIliii[var8]);
         if (var9 == null || !var9.Iiilliiliiil(model.IliIlllilIi(var8)) || lIiiiIiiIiiiIi.IilliliilIIi(queue, var8) < 0 || var7[var8] == null) {
            return false;
         }
      }

      for (int var15 = 0; var15 < var6; var15++) {
         int var16 = lIiiiIiiIiiiIi.IilliliilIIi(queue, var15);
         IIIiIllllIIiIlll var10 = IIIiIllllIIiIlll.iliIiiliiiii(lIiiiIiiIiiiIi.IlilIliiillilIliii[var15]);
         iIiiliIiIliiliIi var11 = model.IliIlllilIi(var15);
         bones.method_22903();

         try {
            bones.method_34425(lillillIIi.set(matrices[var16]).mul(var7[var15]));
            finish.method_73483(bones, model.llIlIIIllilIlIIIll, (entry, skin) -> var10.IIIilIIiiIIi(entry, skin, light, class_4608.field_21444, var11));
            if (model.liiiIIllIl(var15)) {
               finish.method_73529(1).method_73483(bones, model.IiIlIIIllliIlIIIll, (skin, mesh) -> var10.IlIillIiilIi(skin, mesh, var11));
            }
         } finally {
            bones.method_22909();
         }
      }

      return true;
   }

   public static boolean IilliliilIIi() {
      return lIiiIiIlilli(iiIiliiIIlilii.lIIllliIIl);
   }

   public static float IIlllIlliIll(String clip) {
      return Illlllllilll(iiIiliiIIlilii.lIIllliIIl, clip);
   }

   private llIiilIiilIiilIi() {
   }

   public static boolean IIlilIliiIli(
      iiIiliiIIlilii clipName, class_4587 matrices, class_11659 light, lIIllIiiIIllIi knife, String finish, float time, boolean queue, int twirl
   ) {
      if (!lIiiIiIlilli(clipName)) {
         return false;
      } else {
         IIIiIlIilIIiIlIi var8 = iIllillIIi.get(clipName);
         lIIiilIliIIiilIl var9 = var8.IIIllIIIIi;
         var8.lIiiIiIlilli(finish == null ? null : var9.iiiililIll.get(finish), time);
         Matrix4f[] var10 = var8.lIlllIIIIi;
         IillillIIi.set(var10[var8.iIIllIIIIi]).invert();
         llllillIIi.identity();
         if (queue) {
            llllillIIi.set(var8.liIllIIIIi).mul(var8.liiiIIllIl()).setTranslation(0.0F, 0.0F, 0.0F);
         }

         llllillIIi.translate(-var8.IiIllIIIIi.x, -var8.IiIllIIIIi.y, -var8.IiIllIIIIi.z).mul(IillillIIi);
         matrices.method_22903();

         try {
            matrices.method_34425(llllillIIi);
            lllIlIlillIlIl var11 = clipName.IliIlllilIi() ? iiiIIlllIIIlIlll.liiiIIllIl(illIIlllIilIIlll.iiIIIIIill, knife) : null;
            if (var11 == null || !IIiilIiiiIii(var9, var10, matrices, light, twirl, var11)) {
               class_1921 var12 = IIililIili.IilliliilIIi(var8.iiiIlIIIIi);

               for (int var13 = 0; var13 < var9.liiililIll.length; var13++) {
                  if (var8.llIllIIIIi[var13] && !(Math.abs(var10[var13].determinant3x3()) < 1.0E-10F)) {
                     float[] var14 = var9.liiililIll[var13].lIiiIiIlilli();
                     matrices.method_22903();

                     try {
                        matrices.method_34425(var10[var13]);
                        light.method_73483(matrices, var12, (lightx, v) -> Illillliilli(var14, lightx, v, twirl));
                     } finally {
                        matrices.method_22909();
                     }
                  }
               }
            }
         } finally {
            matrices.method_22909();
         }

         return true;
      }
   }

   public static List<String> IlIlllIlilIl() {
      return IiIlliIliiIl(iiIiliiIIlilii.lIIllliIIl);
   }

   public static boolean IIIllIIliIIl(iiIiliiIIlilii knife) {
      return iIllliIlllli.IlIlllIlilIl(knife) || IlllillIIi.contains(knife);
   }

   public static float Ililllililil() {
      return Iiilliiliiil(iiIiliiIIlilii.lIIllliIIl);
   }

   static int[] IliIlllilIi(lIIiilIliIIiilIl knife, iiIiliiIIlilii model) {
      if (model.IliIlllilIi()) {
         int var6 = knife.IiIlliIliiIl(iIIIlIlIIl<"iIIIlIlIIl","UuaYo563sgJsqFxZkOmXPZtR15bVLj37zgyFJxIgRFEObeJ7pw==">());
         int var7 = knife.IiIlliIliiIl(iIIIlIlIIl<"iIIIlIlIIl","OBQlN4LOrbg3Sx884jLQ4JrtVa3BNdbkC5hjaRsZLHlsMaSkVED1uJL9wQ==">());
         if (var6 >= 0 && var7 >= 0) {
            return new int[]{var7, var6};
         } else {
            throw new IllegalStateException(iIIIlIlIIl<"iIIIlIlIIl","d/H4E4z8gCpgWLvXNuIO84PlvBO2iBd9BrvTFcv09ANvuEK7UOXFIa7VsbQahSTSIeUbGviX">());
         }
      } else {
         int var2 = knife.IiIlliIliiIl(iIIIlIlIIl<"iIIIlIlIIl","p53uzO2jEW6IuWFhAmh80TrcTtvlX0S8w/fNbsEDS3jJuLUHcxZucww=">());
         int var3 = -1;

         for (int var4 = var2 < 0 ? -1 : knife.liiililIll[var2].liiiIIllIl(); var4 >= 0; var4 = knife.liiililIll[var4].liiiIIllIl()) {
            if (liiiIIllIl(knife, var4, var2)) {
               var3 = var4;
               break;
            }
         }

         if (var3 >= 0) {
            for (int var9 = 0; var9 < knife.liiililIll.length; var9++) {
               if (knife.liiililIll[var9].liiiIIllIl() == var3 && (var2 < 0 || !knife.IIlllIlliIll(var2, var9)) && liiiIIllIl(knife, var9, -1)) {
                  return new int[]{var3, var9};
               }
            }

            return new int[]{var3, var3};
         } else {
            for (int var8 = 0; var8 < knife.liiililIll.length; var8++) {
               if (knife.liiililIll[var8].lIiiIiIlilli().length > 0) {
                  int var5 = var8;

                  while (knife.liiililIll[var5].liiiIIllIl() >= 0 && knife.liiililIll[knife.liiililIll[var5].liiiIIllIl()].liiiIIllIl() >= 0) {
                     var5 = knife.liiililIll[var5].liiiIIllIl();
                  }

                  return new int[]{-1, var5};
               }
            }

            throw new IllegalStateException(iIIIlIlIIl<"iIIIlIlIIl","ZQERPYOkn5iZz1Jaa9RWmzVSp2Uy+Ih1IrKPCZi1JcVRgsEl06jo1xfagpRs53SJYLpP">());
         }
      }
   }
}
