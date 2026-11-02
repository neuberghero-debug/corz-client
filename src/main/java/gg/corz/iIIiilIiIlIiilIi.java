package gg.corz;

import com.mojang.blaze3d.systems.RenderPass;
import java.util.ArrayDeque;
import java.util.Deque;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public final class iIIiilIiIlIiilIi {
   private static final Deque<int[]> liIlillIIi = new ArrayDeque<>();

   private iIIiilIiIlIiilIi() {
   }

   public static void liiiIIllIl() {
      if (!liIlillIIi.isEmpty()) {
         liIlillIIi.pop();
      }
   }

   private static int[] lIiiIiIlilli(int[] b, int[] a) {
      long var6 = 613611000848534545L;
      long var8 = 1621388646918546819L;
      var6 ^= ((long)Math.max(b[0], a[0]) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)Math.max(b[1], a[1]) ^ var6) & -1L >>> 32;
      var8 ^= ((long)Math.min(b[0] + b[2], a[0] + a[2]) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)Math.min(b[1] + b[3], a[1] + a[3]) ^ var8) & -1L >>> 32;
      return new int[]{(int)(var6 >>> 32), (int)var6, Math.max(0, (int)(var8 >>> 32) - (int)(var6 >>> 32)), Math.max(0, (int)var8 - (int)var6)};
   }

   public static void IilliliilIIi(RenderPass pass) {
      if (!liIlillIIi.isEmpty()) {
         int[] var1 = liIlillIIi.peek();
         pass.enableScissor(var1[0], var1[1], var1[2], var1[3]);
      }
   }

   public static void IliIlllilIi(int y1, int x2, int y2, int x1) {
      long var22 = -2281381041299783394L;
      long var24 = -4688699080664438024L;
      long var26 = -5569820106073088109L;
      class_310 var4 = class_310.method_1551();
      double var5 = (double)var4.method_22683().method_4495();
      var22 ^= ((long)var4.method_22683().method_4506() << 32 ^ var22) & -1L << 32;
      double var8 = (double)y1;
      double var10 = (double)x2;
      double var12 = (double)y2;
      double var14 = (double)x1;
      class_4587 var16 = IIIiiIillIIiiIil.liiiIIllIl();
      if (var16 != null) {
         Matrix4f var17 = var16.method_23760().method_23761();
         if (IliiIilliiIi.IIillIiliIil(var17)) {
            var8 = (double)((float)y1 * var17.m00() + var17.m30());
            var12 = (double)((float)y2 * var17.m00() + var17.m30());
            var10 = (double)((float)x2 * var17.m11() + var17.m31());
            var14 = (double)((float)x1 * var17.m11() + var17.m31());
         }
      }

      var22 ^= ((long)((int)Math.round(var8 * var5)) ^ var22) & -1L >>> 32;
      var24 ^= ((long)((int)Math.round(var12 * var5)) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)((int)Math.round(var10 * var5)) ^ var24) & -1L >>> 32;
      var26 ^= ((long)((int)Math.round(var14 * var5)) << 32 ^ var26) & -1L << 32;
      int[] var21 = new int[]{
         (int)var22, (int)(var22 >>> 32) - (int)(var26 >>> 32), Math.max(0, (int)(var24 >>> 32) - (int)var22), Math.max(0, (int)(var26 >>> 32) - (int)var24)
      };
      if (!liIlillIIi.isEmpty()) {
         var21 = lIiiIiIlilli(liIlillIIi.peek(), var21);
      }

      liIlillIIi.push(var21);
   }

   public static boolean iIlIlllllill() {
      return !liIlillIIi.isEmpty();
   }
}
