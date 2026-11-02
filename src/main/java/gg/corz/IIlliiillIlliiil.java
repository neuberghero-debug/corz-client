package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.GpuBuffer.MappedView;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.minecraft.class_11285;

public final class IIlliiillIlliiil {
   public static int iliillIiil;
   private static final int lilillIiil = 2097152;
   private static final ByteBuffer lliillIiil = ByteBuffer.allocateDirect(256).order(ByteOrder.nativeOrder());
   private static final int illillIiil = 256;
   public static int IiiillIiil;
   private static class_11285 lIiillIiil;
   private static class_11285 iilillIiil;
   private static final int IilillIiil = 524288;
   public static int liiillIiil;
   private static int IliillIiil;
   private static int iIiillIiil;

   private IIlliiillIlliiil() {
   }

   public static ByteBuffer IliIlllilIi(int size) {
      if (size > lliillIiil.capacity()) {
         throw new IllegalArgumentException(
            iliIiiliiiii<"iliIiiliiiii","SK8Pj1ujFlwZ+aUVI6KbJgGYDnKIMWPOjT541xO1m6PSi6LC">()
               + size
               + iliIiiliiiii<"iliIiiliiiii","9p9Za46vK66PqsdZk5dyRV+RTkRCjVfV4wSiBRweFg==">()
               + lliillIiil.capacity()
         );
      } else {
         lliillIiil.clear();
         lliillIiil.limit(size);
         return lliillIiil;
      }
   }

   public static illliiIillii iIlIlllllill(ByteBuffer stride, int data) {
      long var9 = 135611151475093700L;
      var9 ^= ((long)stride.remaining() << 32 ^ var9) & -1L << 32;
      if ((int)(var9 >>> 32) > 2097152) {
         throw new IllegalArgumentException(
            iliIiiliiiii<"iliIiiliiiii","VtJgj5WLFO2aILg/s1EvsLuIMqjHigmrxi+1l5gV2Kx47Kb34Lo1M9w=">()
               + (int)(var9 >>> 32)
               + iliIiiliiiii<"iliIiiliiiii","IE4l0gZ78NBC+q2KGJFc0b1C7nLyEAx3v7P1Jb/aQMyak7QGH6Pu5FWxCg==">()
               + 2097152
               + iliIiiliiiii<"iliIiiliiiii","yNfieDaLQx1+u1uixcRQzsw4SMK1UOP61Ut2IjmypUXy++o=">()
         );
      } else {
         if (lIiillIiil == null) {
            lIiillIiil = new class_11285(() -> iliIiiliiiii<"iliIiiliiiii","4U6VHzednBgRwBZZTx5mgiNamh+00OCE/3FhzkqBrmFxWnF5nCO5Bw==">(), 34, 2097152);
         }

         var9 ^= ((long)((IliillIiil + data - 1) / data * data) ^ var9) & -1L >>> 32;
         if ((int)var9 + (int)(var9 >>> 32) > 2097152) {
            IliiIilliiIi.lilIliilIl();
            lIiillIiil.method_71121();
            IliillIiil = 0;
            var9 ^= (0L ^ var9) & -1L >>> 32;
            liiillIiil++;
         }

         GpuBuffer var4 = lIiillIiil.method_71119();
         GpuBufferSlice var5 = var4.slice((long)((int)var9), (long)((int)(var9 >>> 32)));
         MappedView var6 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(var5, false, true);

         try {
            var6.data().put(0, stride, stride.position(), (int)(var9 >>> 32));
         } catch (Throwable var12) {
            if (var6 != null) {
               try {
                  var6.close();
               } catch (Throwable var11) {
                  var12.addSuppressed(var11);
               }
            }

            throw var12;
         }

         if (var6 != null) {
            var6.close();
         }

         IliillIiil = (int)var9 + (int)(var9 >>> 32);
         return new illliiIillii(var4, (int)var9 / data);
      }
   }

   public static GpuBufferSlice liiiIIllIl(ByteBuffer data) {
      long var8 = 5327218524439885321L;
      var8 ^= ((long)data.remaining() << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)((int)(var8 >>> 32) + 256 - 1 & -256) ^ var8) & -1L >>> 32;
      if (iilillIiil == null) {
         iilillIiil = new class_11285(() -> iliIiiliiiii<"iliIiiliiiii","1q2FQq9ylAfFi3gv4oWRty2ogRfZ1UnjtAlgNYZd5DfnQGYWA2fDsw==">(), 130, 524288);
      }

      if (iIiillIiil + (int)var8 > 524288) {
         IliiIilliiIi.lilIliilIl();
         iilillIiil.method_71121();
         iIiillIiil = 0;
         IiiillIiil++;
      }

      GpuBuffer var3 = iilillIiil.method_71119();
      GpuBufferSlice var4 = var3.slice((long)iIiillIiil, (long)((int)(var8 >>> 32)));
      MappedView var5 = RenderSystem.getDevice().createCommandEncoder().mapBuffer(var4, false, true);

      try {
         var5.data().put(0, data, data.position(), (int)(var8 >>> 32));
      } catch (Throwable var11) {
         if (var5 != null) {
            try {
               var5.close();
            } catch (Throwable var10) {
               var11.addSuppressed(var10);
            }
         }

         throw var11;
      }

      if (var5 != null) {
         var5.close();
      }

      iIiillIiil += (int)var8;
      return var4;
   }
}
