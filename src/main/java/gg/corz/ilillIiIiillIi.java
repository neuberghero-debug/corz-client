package gg.corz;

import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class ilillIiIiillIi {
   public static final float iillliIiiIIilliIii = 3.0F;
   public static final float IiIiliIiiliIiliIii = 0.125F;
   public static final float llllliIiiilllliIii = 1.1F;
   public static final float iIllliIiiIlllliIii = 0.8F;
   public static final float IIIiliIiilIIiliIii = -0.28125F;
   public static final float IlilliIiillilliIii = 0.9375F;
   public static final float iIIiliIiiIlIiliIii = -0.26875F;
   public static final float liIlliIiiiiIlliIii = 24.0F;
   public static final float ililliIiiIiilliIii = -1.501F;
   private static final float IlliliIiillliliIii = (float) (Math.PI / 180.0);
   public static final float lIilliIiiiIilliIii = 0.05F;
   public static final float lIliliIiiiIliliIii = 0.25F;
   public static final float llIiliIiiilIiliIii = 0.0625F;
   public static final float iiIiliIiiIIliliIii = 0.0625F;
   public static final float IIllliIiilIllliIii = 0.94F;
   public static final float IillliIiilillliIii = 0.92F;
   public static final float liilliIiiiiilliIii = 0.125F;

   public static int iIlIlllllill(float supersample, double scaleFactor, int layoutPx) {
      return Math.max(1, Math.round((float)((double)supersample * scaleFactor * (double)layoutPx)));
   }

   public static float Iilllilliill(float h, float ndcY, float y) {
      return ndcY + (0.5F - h * 0.5F) * y;
   }

   private ilillIiIiillIi() {
   }

   public static Matrix4f IilliliilIIi(Matrix4f aspect, float out, float distance) {
      return aspect.setPerspective(0.41887903F, out, Math.max(0.05F, distance - 3.0F), distance + 3.0F);
   }

   public static void IIIllIIliIIl(Matrix4f normal, Matrix3f pos) {
      normal.scale(0.9375F, -0.9375F, -0.9375F).translate(0.0F, -1.501F, 0.0F);
      if (pos != null) {
         pos.scale(1.0F, -1.0F, -1.0F);
      }
   }

   public static float IliIlllilIi(float aspect, float fovYDeg, float halfH, float halfW) {
      double var4 = Math.tan(Math.toRadians((double)aspect) / 2.0);
      return (float)Math.max((double)halfW / var4, (double)halfH / (var4 * Math.max(0.001, (double)fovYDeg)));
   }

   public static float liiiIIllIl(float aspect) {
      return IliIlllilIi(24.0F, aspect, 0.8F, 1.1F) / 0.92F;
   }

   public static float Illlllllilll(float w, float x, float ndcX) {
      return x + (w * 0.5F + 0.5F) * ndcX;
   }

   public static float IIlllIlliIll(float viewZ, float stageH) {
      float var2 = -viewZ;
      return !(var2 > 1.0E-4F) ? 0.0F : stageH / (2.0F * var2 * (float)Math.tan((float) (Math.PI / 15)));
   }

   public static float IIillIiliIil(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   public static void lIiiIiIlilli(Matrix4f pos, Matrix3f distance, float normal, float pitchDeg) {
      pos.translate(0.0F, 0.0F, -normal).rotateX(pitchDeg * (float) (Math.PI / 180.0)).translate(0.0F, -0.94F, 0.0F);
      if (distance != null) {
         distance.rotateX(pitchDeg * (float) (Math.PI / 180.0));
      }
   }

   public static void iliIiiliiiii(Matrix4f yawDeg, Matrix3f normal, float pos) {
      yawDeg.rotateY(-pos * (float) (Math.PI / 180.0));
      if (normal != null) {
         normal.rotateY(-pos * (float) (Math.PI / 180.0));
      }
   }

   public static float IiIlliIliiIl(Vector3f eye, Vector3f ahead) {
      float var2 = ahead.x - eye.x;
      float var3 = ahead.y - eye.y;
      float var4 = ahead.z - eye.z;
      float var5 = (float)Math.sqrt((double)(var2 * var2 + var3 * var3 + var4 * var4)) * eye.length();
      if (!(var5 > 1.0E-6F)) {
         return 0.0F;
      } else {
         float var6 = -(var2 * eye.x + var3 * eye.y + var4 * eye.z) / var5;
         return IIillIiliIil((var6 - 0.25F) / 0.75F);
      }
   }

   public static Matrix4f IlIlllIlilIl(Matrix4f out, float yawDeg, float distance, float pitchDeg) {
      out.identity();
      lIiiIiIlilli(out, null, yawDeg, distance);
      iliIiiliiiii(out, null, pitchDeg);
      IIIllIIliIIl(out, null);
      return out;
   }
}
