package gg.corz;

import org.joml.Matrix4f;

public final class ilIIliilIiIIliil {
   public static final float iiillIilil = 9.0F;
   public static final float iIillIilil = 35.0F;
   public static final float ilillIilil = 0.8F;
   public static final float IlillIilil = 26.0F;
   public static final float liillIilil = 12.0F;
   public static final float IiillIilil = 0.45F;
   public static final float llillIilil = 80.0F;

   public static float iliIiiliiiii(float pan, float limit) {
      float var2 = Math.max(0.0F, limit);
      return pan < -var2 ? -var2 : (pan > var2 ? var2 : pan);
   }

   private ilIIliilIiIIliil() {
   }

   public static float iIlIlllllill(float sy, float viewH, float sz, float sx, float pitchDeg, float viewW) {
      if (!(sx <= 0.0F) && !(pitchDeg <= 0.0F)) {
         float var6 = Math.max(0.5F, IliIlllilIi(sy, sz));
         double var7 = Math.toRadians(Math.min(90.0, (double)Math.abs(viewW)));
         float var9 = (float)((double)var6 * Math.sin(var7) + (double)Math.max(0.5F, viewH) * 0.5 * Math.cos(var7));
         float var10 = sx * 0.5F / var6;
         float var11 = pitchDeg * 0.5F / Math.max(0.5F, var9);
         return Math.max(0.001F, 0.8F * Math.min(var10, var11));
      } else {
         return 1.0F;
      }
   }

   public static float lIiiIiIlilli(float oldScale, float pan, float cursor, float newScale) {
      return !(cursor <= 0.0F) && !(newScale <= 0.0F) ? oldScale + pan * (1.0F / newScale - 1.0F / cursor) : oldScale;
   }

   public static float IliIlllilIi(float sx, float sz) {
      return 0.5F * (float)Math.sqrt((double)(sx * sx + sz * sz));
   }

   public static Matrix4f IilliliilIIi(
      Matrix4f cy, float cz, float yawDeg, float scale, float panY, float out, float pitchDeg, float panX, float radius, float viewH, float cx, float viewW
   ) {
      float var12 = (Math.max(0.5F, panY) + 2.0F) * panX;
      return cy.setOrtho(-cx * 0.5F, cx * 0.5F, -viewW * 0.5F, viewW * 0.5F, -var12, var12)
         .scale(panX)
         .translate(radius, viewH, 0.0F)
         .rotateX((float)Math.toRadians((double)pitchDeg))
         .rotateY((float)Math.toRadians((double)(-out)))
         .translate(-cz, -yawDeg, -scale);
   }

   public static float liiiIIllIl(float sz, float sx, float sy) {
      return 0.5F * (float)Math.sqrt((double)(sz * sz + sx * sx + sy * sy));
   }
}
