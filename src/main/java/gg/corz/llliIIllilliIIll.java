package gg.corz;

import java.util.Optional;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import net.minecraft.class_10055;
import net.minecraft.class_11659;
import net.minecraft.class_11890;
import net.minecraft.class_1799;
import net.minecraft.class_1921;
import net.minecraft.class_310;
import net.minecraft.class_3879;
import net.minecraft.class_4050;
import net.minecraft.class_4587;
import net.minecraft.class_572;
import net.minecraft.class_630;
import net.minecraft.class_742;
import net.minecraft.class_8685;
import net.minecraft.class_12079.class_12081;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class llliIIllilliIIll {
   private static float ilIlIlllll;
   private static final Matrix4f IlllIlllll = new Matrix4f();
   private static final float lliIIlllll = 0.5F;
   private static final float iiiIIlllll = Float.POSITIVE_INFINITY;
   private static final long IiiIIlllll = 1000000000L;
   private static final float iliIIlllll = 1.8F;
   private static final float[] illlIlllll = new float[8];
   private static long llIlIlllll;
   private static final Matrix4f lIllIlllll = new Matrix4f();
   private static final float liIlIlllll = 0.1F;
   private static final RenderStateDataKey<lIlIiliIlIil> lilIIlllll = RenderStateDataKey.create(
      () -> IIIilIIiiIIi<"IIIilIIiiIIi","RhJxUrApizk92QlGDxmgsXn6rXpAduUmZbfVb72p0NiQr3uM2q/w0g==">()
   );
   private static float IiIlIlllll;
   private static float iIIlIlllll;
   private static final float[] IillIlllll = new float[8];
   private static lIlIiliIlIil iiIlIlllll;
   private static boolean lIIlIlllll;
   private static boolean IIIlIlllll;
   private static final float lIiIIlllll = -0.85F;
   private static final float iIiIIlllll = 1.1F;
   private static final Vector3f llllIlllll = new Vector3f();
   private static final Matrix4f iIllIlllll = new Matrix4f();
   private static final Matrix4f IIllIlllll = new Matrix4f();
   private static final float IliIIlllll = 13.0F;
   private static final float IIiIIlllll = 0.0625F;
   private static float IlIlIlllll;
   private static final long liiIIlllll = 100000000L;
   private static final float iilIIlllll = (float) (Math.PI / 180.0);

   public static void liiiIIllIl(float yawDegrees) {
      lIIlIlllll = true;
      iIIlIlllll = Float.isFinite(yawDegrees) ? yawDegrees : 0.0F;
   }

   private static boolean Illlllllilll(class_1799 stack) {
      return stack != null && !stack.method_7960();
   }

   static float IIIllIIliIIl(class_10055 s) {
      float var1 = 0.0F;
      if (s.field_53411) {
         if (!s.field_53459) {
            var1 = s.method_64259() * (90.0F + s.field_53448);
         }
      } else if (s.field_53403 > 0.0F) {
         var1 = s.field_53403 * (s.field_53458 ? 90.0F + s.field_53448 : 90.0F);
      }

      float var2 = var1 * (float) (Math.PI / 180.0);
      if (s.field_53410) {
         var2 += 0.5F;
      }

      return var2;
   }

   static void Ililllililil(String t, Throwable where) {
      if (!IIIlIlllll) {
         IIIlIlllll = true;
      }
   }

   private static void IiIlliIliiIl(class_3879 state, Object model) {
      state.method_2819(model);
   }

   private static void IIillIiliIil(IllIlIilllIlIi z0, float inflate, float env, float y1, float y0, float x1, float x0, float yLimit, float z1) {
      long var13 = 6693716324060263044L;
      lIllIlllll.mul(iIllIlllll, IlllIlllll);

      for (long var15 = var13 ^ (0L ^ var13) & -1L << 32; (int)(var15 >>> 32) < 8; var15 += 4294967296L) {
         float var10 = ((int)(var15 >>> 32) & 1) == 0 ? inflate - yLimit : y0 + yLimit;
         float var11 = ((int)(var15 >>> 32) & 2) == 0 ? env - yLimit : x1 + yLimit;
         float var12 = ((int)(var15 >>> 32) & 4) == 0 ? y1 - yLimit : x0 + yLimit;
         IlllIlllll.transformPosition(var10, var11, var12, llllIlllll);
         illlIlllll[(int)(var15 >>> 32)] = llllIlllll.y;
         IillIlllll[(int)(var15 >>> 32)] = llllIlllll.z;
      }

      z0.lIiiIiIlilli(illlIlllll, IillIlllll, 8, z1);
   }

   public static boolean lIiiIiIlilli(class_10055 state) {
      return !IIIlIlllll && state.getData(lilIIlllll) != null;
   }

   private static void Iilllilliill(Matrix4f m, class_630 p) {
      m.translate(p.field_3657, p.field_3656, p.field_3655);
      if (p.field_3654 != 0.0F || p.field_3675 != 0.0F || p.field_3674 != 0.0F) {
         m.rotateZYX(p.field_3674, p.field_3675, p.field_3654);
      }

      if (p.field_37938 != 1.0F || p.field_37939 != 1.0F || p.field_37940 != 1.0F) {
         m.scale(p.field_37938, p.field_37939, p.field_37940);
      }
   }

   public static void IilliliilIIi(class_11890 entity, class_10055 tickDelta, float state) {
      long var11 = -6607741845775239265L;
      if (IliIlllilIi() && !tickDelta.field_53333 && tickDelta.field_53532) {
         try {
            class_8685 var3 = tickDelta.field_53520;
            if (var3 == null) {
               return;
            }

            class_12081 var4 = var3.comp_1627();
            if (var4 == null || !iIllIIlIlllIIl.lllllillll(var4.comp_3627())) {
               return;
            }

            if (!(entity instanceof class_742 var5)) {
               return;
            }

            var11 ^= ((long)tickDelta.method_62613(class_4050.field_18078) << 32 ^ var11) & -1L << 32;
            float var9 = 1.0F;
            lIlIiliIlIil var7;
            float var8;
            if (lIIlIlllll && var5 == class_310.method_1551().field_1724) {
               if (iiIlIlllll == null) {
                  iiIlIlllll = new lIlIiliIlIil();
               }

               var7 = iiIlIlllll;
               var8 = IlIlllIlilIl(var7.iIIIiIliIlIIiIli);
               var9 = 1.8F;
               var11 ^= (0L ^ var11) & -1L << 32;
            } else {
               if (!(var5 instanceof IlIlllIlilIl var10)) {
                  return;
               }

               var7 = var10.corz$capeFrame();
               if (var7 == null) {
                  var7 = new lIlIiliIlIil();
                  var10.corz$capeFrame(var7);
               }

               var7.iIIIiIliIlIIiIli
                  .iIlIlllllill(
                     var5.field_6012,
                     var5.method_23317(),
                     var5.method_23318(),
                     var5.method_23321(),
                     var5.field_6283,
                     IIIllIIliIIl(tickDelta),
                     (boolean)((int)(var11 >>> 32))
                  );
               var8 = state;
            }

            var7.IllIiIlilllIiIli = (boolean)((int)(var11 >>> 32));
            if ((int)(var11 >>> 32) != 0) {
               lIIIIilliIIIIill.liiiIIllIl(var7.llIIiIliilIIiIli, var7.IiIIiIliliIIiIli);
            } else {
               lIIIIilliIIIIill.IliIlllilIi(
                  var7.iIIIiIliIlIIiIli.lIiIIlliiIiIIlli,
                  var8,
                  tickDelta.field_53450,
                  tickDelta.field_53451,
                  var9,
                  var7.llIIiIliilIIiIli,
                  var7.IiIIiIliliIIiIli
               );
            }

            tickDelta.setData(lilIIlllll, var7);
         } catch (Throwable var13) {
            Ililllililil(IIIilIIiiIIi<"IIIilIIiiIIi","9OnTRjk4MGZf6Vjf/SdwTdb23CnkAoCuOckHjPG1a79uUqA=">(), var13);
         }
      }
   }

   public static boolean iliIiiliiiii(
      class_11659 outline,
      class_3879<?> overlay,
      class_10055 state,
      class_4587 queue,
      class_1921 matrices,
      int light,
      int chestOffset,
      int layer,
      boolean model
   ) {
      long var17 = -5080286422118989596L;
      long var15 = -3496407168317403027L;
      if (IIIlIlllll) {
         return false;
      } else {
         lIlIiliIlIil var9 = (lIlIiliIlIil)state.getData(lilIIlllll);
         if (var9 != null && overlay instanceof class_572 var10) {
            var15 ^= (0L ^ var15) & -1L << 32;

            try {
               IiIlliIliiIl(overlay, state);
               IIlllIlliIll(var10, state, model, var9.iiIIiIliIIlIiIli);
               var9.iIIIiIliIlIIiIli.IliIIllilliIIlli.liiiIIllIl(var9.iiIIiIliIIlIiIli);
               var9.IliIlllilIi();
               var9.illIiIliIilIiIli = light;
               var9.lilIiIliiilIiIli = chestOffset;
               var9.IIiIiIlilIiIiIli = layer;
               queue.method_22903();
               var15 ^= (4294967296L ^ var15) & -1L << 32;
               var10.method_63512().method_22703(queue);
               var10.field_3391.method_22703(queue);
               queue.method_22905(0.0625F, 0.0625F, 0.0625F);
               outline.method_73483(queue, matrices, var9.IiiIiIliliiIiIli);
               if (layer != 0) {
                  Optional var12 = matrices.method_23289();
                  if (var12.isPresent()) {
                     outline.method_73483(queue, (class_1921)var12.get(), var9.iiiIiIliIIIliIli);
                  }
               }

               var15 ^= (1L ^ var15) & -1L >>> 32;
               return (boolean)((int)var15);
            } catch (Throwable var21) {
               Ililllililil(IIIilIIiiIIi<"IIIilIIiiIIi","K+70CZq97wn6tCaWuD4nzFiYteFi9ipEkpulQavUPtMOUw==">(), var21);
               var17 ^= (0L ^ var17) & -1L << 32;
            } finally {
               if ((int)(var15 >>> 32) != 0) {
                  queue.method_22909();
               }
            }

            return (boolean)((int)(var17 >>> 32));
         } else {
            return false;
         }
      }
   }

   public static boolean IliIlllilIi() {
      return !IIIlIlllll && iIllIIlIlllIIl.iIlllIllll();
   }

   private static void IIlllIlliIll(class_572<?> m, class_10055 chestOffset, boolean env, IllIlIilllIlIi s) {
      s.IliIlllilIi();
      class_630 var4 = m.method_63512();
      IIllIlllll.identity();
      if (env) {
         IIllIlllll.translate(0.0F, -0.85F, 1.1F);
      }

      Iilllilliill(IIllIlllll, var4);
      Iilllilliill(IIllIlllll, m.field_3391);
      IIllIlllll.invertAffine(lIllIlllll);
      iIllIlllll.identity();
      Iilllilliill(iIllIlllll, var4);
      Iilllilliill(iIllIlllll, m.field_3391);
      IIillIiliIil(s, -4.0F, 0.0F, -2.0F, 4.0F, 12.0F, 2.0F, 0.25F, Float.POSITIVE_INFINITY);
      float var5 = Illlllllilll(chestOffset.field_53420) ? 1.0F : (Illlllllilll(chestOffset.field_53419) ? 0.5F : 0.25F);
      iIllIlllll.identity();
      Iilllilliill(iIllIlllll, var4);
      Iilllilliill(iIllIlllll, m.field_3392);
      IIillIiliIil(s, -2.0F, 0.0F, -2.0F, 2.0F, 12.0F, 2.0F, var5, Float.POSITIVE_INFINITY);
      iIllIlllll.identity();
      Iilllilliill(iIllIlllll, var4);
      Iilllilliill(iIllIlllll, m.field_3397);
      IIillIiliIil(s, -2.0F, 0.0F, -2.0F, 2.0F, 12.0F, 2.0F, var5, Float.POSITIVE_INFINITY);
      float var6 = !Illlllllilll(chestOffset.field_55309) && chestOffset.field_55315 == null ? 0.5F : 1.25F;
      iIllIlllll.identity();
      Iilllilliill(iIllIlllll, var4);
      Iilllilliill(iIllIlllll, m.field_3398);
      IIillIiliIil(s, -4.0F, -8.0F, -4.0F, 4.0F, 0.0F, 4.0F, var6, 0.0F);
      if (chestOffset.field_53413) {
         s.iIlIlllllill(13.0F);
      }
   }

   private static float IlIlllIlilIl(lliIililiIil rig) {
      long var6 = -2711673719620885601L;
      long var1 = System.nanoTime();
      if (llIlIlllll != 0L && var1 - llIlIlllll <= 1000000000L) {
         ilIlIlllll = ilIlIlllll + (float)Math.min(var1 - llIlIlllll, 100000000L) / 1.0E9F;
      } else {
         rig.iliIiiliiiii();
         ilIlIlllll = 0.0F;
         IlIlIlllll = iIIlIlllll;
      }

      llIlIlllll = var1;

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; ilIlIlllll >= 0.05F; ilIlIlllll -= 0.05F) {
         int var10000 = (int)(var8 >>> 32);
         var8 += 4294967296L;
         if (var10000 >= 4) {
            break;
         }

         float var4 = lliIililiIil.IiIlliIliiIl(iIIlIlllll - IlIlIlllll) * (float) (Math.PI / 180.0);
         IlIlIlllll = iIIlIlllll;
         IiIlIlllll = (IiIlIlllll + 0.05F) % 3600.0F;
         float var5 = 0.1F + 0.05F * (float)Math.sin((double)(IiIlIlllll * 0.9F)) + 0.03F * (float)Math.sin((double)(IiIlIlllll * 2.3F + 1.1F));
         rig.lIiiIiIlilli(0.0F, var4, var5);
      }

      if (ilIlIlllll >= 0.05F) {
         ilIlIlllll = 0.0F;
      }

      return ilIlIlllll / 0.05F;
   }

   public static void iIlIlllllill() {
      lIIlIlllll = false;
   }

   private llliIIllilliIIll() {
   }
}
