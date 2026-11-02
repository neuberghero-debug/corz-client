package gg.corz;

import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class illIIIlIilIIIl {
   public static final float ililiIiIlIiiliIiIl = 0.6F;
   public static final float IliliIiIllliliIiIl = 0.62F;
   public static final float lIiliIiIliIiliIiIl = 0.41F;
   static final float IIIiiIiIllIIiiIiIl = 0.75F;
   public static final float iilliIiIlIIiliIiIl = 1.3F;
   private static final float iIIiiIiIlIlIiiIiIl = 1.0E-10F;
   public static final float liiliIiIliiiliIiIl = 0.4F;

   public static Vector3f IliIlllilIi(iiIiliiIIlilii model, lIIiilIliIIiilIl knife) {
      Vector3f var2 = new Vector3f();
      if (model != null && !model.IliIlllilIi() && !liiiIIllIl<"liiiIIllIl","9c1xtSyoT7QzF3pXsaK2PU49OAxcNwufCfifQjpbhgtCSg7n">().equals(model.illilliIIl)) {
         lliIiiililiIiiil var3 = knife.iiiililIll.get(iIIIIilIlIIIil.IliIlllilIi(model, knife));
         if (var3 == null) {
            return var2;
         } else {
            float[] var4 = knife.Illlllllilll();
            var3.IliIlllilIi(0.0F, var4);
            Matrix4f[] var5 = knife.Iilllilliill();
            knife.IIillIiliIil(var4, var5);
            Vector3f var6 = new Vector3f();
            Vector3f var7 = new Vector3f(Float.POSITIVE_INFINITY);
            Vector3f var8 = new Vector3f(Float.NEGATIVE_INFINITY);
            Vector3f var9 = new Vector3f();
            int var10 = 0;
            Matrix4f var11 = new Matrix4f();

            for (int var12 = 0; var12 < knife.liiililIll.length; var12++) {
               iiIIliiIIlIlii var13 = knife.liiililIll[var12];
               if (!(Math.abs(var5[var12].determinant3x3()) < 1.0E-10F)) {
                  knife.IIIIiilIll.mul(var5[var12], var11);
                  if (var13.iliIiiliiiii() != 0) {
                     float[] var19 = var13.IIIllIIliIIl() == null ? new float[3] : var13.IIIllIIliIIl();
                     var6.add(var11.transformPosition(var19[0], var19[1] - 0.75F, var19[2], var9));
                     var10++;
                  } else {
                     float[] var14 = var13.lIiiIiIlilli();

                     for (byte var15 = 0; var15 < var14.length; var15 += 8) {
                        var11.transformPosition(var14[var15], var14[var15 + 1], var14[var15 + 2], var9);
                        var7.min(var9);
                        var8.max(var9);
                     }
                  }
               }
            }

            if (var10 != 0 && !(var7.x > var8.x)) {
               var6.div((float)var10);
               float var16 = 1.3F + var6.z;
               float var18 = -(var7.z + var8.z) / 2.0F;
               if (var18 > 0.0F) {
                  var16 = Math.min(var16, var18 * (var8.distance(var7) / var18 / 0.62F - 1.0F));
               }

               var16 = Float.isFinite(var16) ? Math.clamp(var16, 0.0F, 0.6F) : 0.0F;
               float var20 = var6.y + 0.41F * (var16 - var6.z);
               var20 = Float.isFinite(var20) ? Math.clamp(var20, 0.0F, 0.4F) : 0.0F;
               return var2.set(0.0F, -var20, -var16);
            } else {
               return var2;
            }
         }
      } else {
         return var2;
      }
   }

   private illIIIlIilIIIl() {
   }
}
