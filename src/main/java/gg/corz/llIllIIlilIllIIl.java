package gg.corz;

import net.minecraft.class_10055;
import net.minecraft.class_1306;
import net.minecraft.class_4587;
import org.joml.Quaternionf;
import org.joml.Vector3f;

final class llIllIIlilIllIIl {
   static final float IlIilillIl = 0.5F;
   static final float IIIilillIl = (float)Math.toRadians(5.0);
   static final float ilillillIl = -0.0625F;
   static final float iiillillIl = 0.375F;
   static final float lIillillIl = 0.0625F;
   static final float liillillIl = 1.5F;
   static final float iIIilillIl = 0.09375F;
   static final float IiillillIl = 0.84375F;
   static final float IlillillIl = -0.8125F;
   static final float ilIilillIl = -30.0F;
   static final float IiIilillIl = 0.0F;
   static final float lIIilillIl = (float)Math.toRadians(2.5);
   static final float liIilillIl = 45.0F;
   static final float iIillillIl = -0.71875F;
   static final float llIilillIl = 0.8F;
   static final float llillillIl = -0.3125F;

   static Vector3f IIIllIIliIIl(Vector3f palm, Vector3f a, Vector3f far, lliIllIliliIllIl out) {
      float var4 = a.x - far.x;
      float var5 = a.y - far.y;
      float var6 = a.z - far.z;
      float var7 = (float)Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6));
      float var8 = var7 > 1.0E-6F ? out.IliiIiIiIl * 1.2F * 0.0625F / var7 : 0.0F;
      return palm.set(
         a.x + var4 * var8 + out.lllIliIiIl * 0.0625F,
         a.y + var5 * var8 + (out.illIliIiIl - out.liIIliIiIl) * 0.0625F,
         a.z + var6 * var8 + out.IilIliIiIl * 0.0625F
      );
   }

   static Vector3f IliIlllilIi(Vector3f out, float turn) {
      return out.set(-0.71875F, -0.8125F, -0.3125F).rotateY(turn);
   }

   static Vector3f iliIiiliiiii(IIIlilIIli bot, class_10055 space, Quaternionf pose, class_4587 out, Vector3f lean) {
      out.method_34426();
      IilliliilIIi(out, pose);
      bot.method_72859(space, class_1306.field_6183, out);
      out.method_46416(-0.0625F, 0.84375F, 0.0F);
      return out.method_23760().method_23761().transformPosition(lean.set(0.0F, 0.0F, 0.0F));
   }

   static float IIlllIlliIll(float scale, float s) {
      return (0.5F + 0.3F * scale) * s;
   }

   static Vector3f IlIlllIlilIl(Vector3f out, Vector3f anchor, Vector3f palm, float s, float lift) {
      out.set(anchor).lerp(palm, s);
      out.y = out.y - (0.09375F * (float)Math.sin(Math.PI * (double)s) + lift * 0.0625F);
      return out;
   }

   static float liiiIIllIl(float deg) {
      float var1 = 30.0F;
      float var2 = (deg - -30.0F) % 360.0F;
      if (var2 < 0.0F) {
         var2 += 360.0F;
      }

      float var3;
      if (var2 <= var1) {
         var3 = -30.0F + var2;
      } else if (var2 <= var1 + 45.0F) {
         var3 = 0.0F;
      } else if (var2 < 315.0F) {
         var3 = 0.0F + -30.0F * (var2 - var1 - 45.0F) / (360.0F - var1 - 90.0F);
      } else {
         var3 = -30.0F;
      }

      return var3 - -30.0F - var2;
   }

   static void IiIlliIliiIl(Vector3f dt, Vector3f omega, Vector3f vel, float pos, float target) {
      float var5 = (float)Math.exp((double)(-pos * target));
      float var6 = (omega.x + pos * (dt.x - vel.x)) * target;
      float var7 = (omega.y + pos * (dt.y - vel.y)) * target;
      float var8 = (omega.z + pos * (dt.z - vel.z)) * target;
      omega.set((omega.x - pos * var6) * var5, (omega.y - pos * var7) * var5, (omega.z - pos * var8) * var5);
      dt.set(vel.x + (dt.x - vel.x + var6) * var5, vel.y + (dt.y - vel.y + var7) * var5, vel.z + (dt.z - vel.z + var8) * var5);
   }

   static Quaternionf iIlIlllllill(Quaternionf out, float lean) {
      return out.rotationXYZ(-IIIilillIl * lean, 0.0F, lIIilillIl * lean);
   }

   static Vector3f lIiiIiIlilli(Vector3f lean, Vector3f out, Quaternionf body) {
      lean.set(out.x, out.y - 1.5F, out.z);
      body.transformInverse(lean);
      return lean.set(lean.x / 0.0625F, (lean.y + 1.5F) / 0.0625F, lean.z / 0.0625F);
   }

   static void IilliliilIIi(class_4587 m, Quaternionf lean) {
      m.method_46416(0.0F, 1.5F, 0.0F);
      m.method_22907(lean);
      m.method_46416(0.0F, -1.5F, 0.0F);
   }

   private llIllIIlilIllIIl() {
   }
}
