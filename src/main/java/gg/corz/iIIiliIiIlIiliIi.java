package gg.corz;

import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;
import org.joml.Vector4f;

public final class iIIiliIiIlIiliIi {
   public static void IilliliilIIi(float out, float pitchDegrees, float ndcY, float aspect, float fovDegrees, float yawDegrees, Vector3f ndcX) {
      float var7 = (float)Math.tan(Math.toRadians((double)aspect) * 0.5);
      Vector3f var8 = new Vector3f(out * var7 * ndcY, pitchDegrees * var7, 1.0F).normalize();
      float var9 = (float)Math.toRadians((double)(-fovDegrees));
      float var10 = (float)Math.toRadians((double)yawDegrees);
      float var11 = (float)Math.cos((double)var10);
      float var12 = (float)Math.sin((double)var10);
      float var13 = var8.x;
      float var14 = var11 * var8.y - var12 * var8.z;
      float var15 = var12 * var8.y + var11 * var8.z;
      float var16 = (float)Math.cos((double)var9);
      float var17 = (float)Math.sin((double)var9);
      ndcX.set(var16 * var13 - var17 * var15, var14, var17 * var13 + var16 * var15);
   }

   public static void liiiIIllIl(Vector3f sky, float[] uv) {
      float var2 = sky.x;
      float var3 = Math.max(sky.y, 0.0F);
      float var4 = sky.z;
      float var5 = Math.abs(var2) + var3 + Math.abs(var4);
      if (var5 < 1.0E-6F) {
         uv[0] = 0.5F;
         uv[1] = 0.5F;
      } else {
         float var6 = var2 / var5;
         float var7 = var4 / var5;
         uv[0] = (var6 + var7) * 0.5F + 0.5F;
         uv[1] = (var6 - var7) * 0.5F + 0.5F;
      }
   }

   public static void iIlIlllllill(float out, float v, Vector3f u) {
      float var3 = out * 2.0F - 1.0F;
      float var4 = v * 2.0F - 1.0F;
      float var5 = (var3 + var4) * 0.5F;
      float var6 = (var3 - var4) * 0.5F;
      float var7 = Math.max(1.0F - Math.abs(var5) - Math.abs(var6), 0.0F);
      u.set(var5, var7, var6).normalize();
   }

   public static void IliIlllilIi(Vector3f out, Vector3f world) {
      world.set(-out.x, out.y, out.z);
   }

   public static boolean lIiiIiIlilli(Matrix4f projection, Quaternionf out, Matrix4f cameraRotation) {
      if (projection != null && out != null && projection.m23() != 0.0F) {
         cameraRotation.rotation(out).transpose();
         cameraRotation.mulLocal(projection);
         if (Float.isFinite(cameraRotation.determinant()) && !(Math.abs(cameraRotation.determinant()) < 1.0E-12F)) {
            cameraRotation.invert();
            return cameraRotation.isFinite();
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static void iliIiiliiiii(Matrix4f ndcY, float ndcX, float inverseViewProjection, Vector3f outSky) {
      Vector4f var4 = new Vector4f(ndcX, inverseViewProjection, 1.0F, 1.0F).mul(ndcY);
      Vector3f var5 = new Vector3f(var4.x / var4.w, var4.y / var4.w, var4.z / var4.w).normalize();
      IliIlllilIi(var5, outSky);
   }

   public static void IlIlllIlilIl(float angleRadians, Vector3f out) {
      out.set((float)(-Math.sin((double)angleRadians)), (float)Math.cos((double)angleRadians), 0.0F);
   }

   public static void IIIllIIliIIl(float out, float pitchDegrees, Quaternionf yawDegrees) {
      yawDegrees.rotationYXZ((float) Math.PI - (float)Math.toRadians((double)out), (float)(-Math.toRadians((double)pitchDegrees)), 0.0F);
   }

   private iIIiliIiIlIiliIi() {
   }
}
