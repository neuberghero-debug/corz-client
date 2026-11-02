package gg.corz;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import net.minecraft.class_276;
import net.minecraft.class_6367;

public final class lliliilili {
   private static boolean IIIlIlIllIIlIlIl;
   private static boolean liiIIlIliiiIIlIl;
   private static class_6367 IliIIlIllliIIlIl;
   public static final int iilIIlIlIIiIIlIl = 512;
   private static long iliIIlIlIiiIIlIl;
   private static final long lIiIIlIliIiIIlIl = 33000000L;

   private lliliilili() {
   }

   public static boolean iIlIlllllill(long now) {
      if (liiIIlIliiiIIlIl) {
         return false;
      } else {
         IiIliIllliIliIll var2 = IiIliIllliIliIll.iiiIlIIIll();
         if (var2 == null) {
            return false;
         } else {
            try {
               if (IliIIlIllliIIlIl == null) {
                  IliIIlIllliIIlIl = new class_6367(
                     lIiiIiIlilli<"lIiiIiIlilli","pNgxiovyrXKcIkUCXTRMYIXItJke1pILQ8alms6HBoKDvzKK/Hj5s9sjFJZ3SXc=">(), 512, 512, false
                  );
                  IIIlIlIllIIlIlIl = false;
               }

               if (!IIIlIlIllIIlIlIl || now - iliIIlIlIiiIIlIl >= 33000000L) {
                  RenderSystem.getDevice().createCommandEncoder().clearColorTexture(IliIIlIllliIIlIl.method_30277(), -16777216);
                  IIIlIlIllIIlIlIl = var2.liilliiill(IliIIlIllliIIlIl.method_71639(), 512);
                  iliIIlIlIiiIIlIl = now;
               }

               return IIIlIlIllIIlIlIl;
            } catch (Throwable var4) {
               liiIIlIliiiIIlIl = true;
               IilliliilIIi();
               return false;
            }
         }
      }
   }

   public static GpuTextureView IliIlllilIi() {
      return IliIIlIllliIIlIl == null ? null : IliIIlIllliIIlIl.method_71639();
   }

   public static void IilliliilIIi() {
      if (IliIIlIllliIIlIl != null) {
         IliIIlIllliIIlIl.method_1238();
         IliIIlIllliIIlIl = null;
      }

      IIIlIlIllIIlIlIl = false;
   }

   public static class_276 liiiIIllIl() {
      return IIIlIlIllIIlIlIl ? IliIIlIllliIIlIl : null;
   }
}
