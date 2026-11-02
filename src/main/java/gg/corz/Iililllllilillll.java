package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import net.minecraft.class_9801;
import net.minecraft.class_9801.class_4574;

final class Iililllllilillll implements AutoCloseable {
   class_5596 liIlliIill = class_5596.field_27382;
   private int ilIlliIill;
   private final String iiIlliIill;
   private GpuBuffer llIlliIill;
   int IiIlliIill;

   @Override
   public void close() {
      if (this.llIlliIill != null) {
         this.llIlliIill.close();
         this.llIlliIill = null;
      }

      this.ilIlliIill = 0;
      this.IiIlliIill = 0;
   }

   Iililllllilillll(String label) {
      this.iiIlliIill = label;
   }

   boolean IliIlllilIi() {
      return this.llIlliIill == null || this.IiIlliIill == 0;
   }

   GpuBuffer liiiIIllIl() {
      return this.llIlliIill;
   }

   void iIlIlllllill(class_9801 built) {
      long var5 = -743012990799291543L;
      if (built == null) {
         this.IiIlliIill = 0;
      } else {
         ByteBuffer var2 = built.method_60818();
         var5 ^= ((long)var2.remaining() << 32 ^ var5) & -1L << 32;
         class_4574 var4 = built.method_60822();
         this.liIlliIill = var4.comp_752();
         this.IiIlliIill = var4.comp_751();
         if ((int)(var5 >>> 32) != 0 && this.IiIlliIill != 0) {
            if (this.llIlliIill == null || this.ilIlliIill < (int)(var5 >>> 32)) {
               if (this.llIlliIill != null) {
                  this.llIlliIill.close();
               }

               this.llIlliIill = RenderSystem.getDevice().createBuffer(() -> this.iiIlliIill, 40, (long)((int)(var5 >>> 32)));
               this.ilIlliIill = (int)(var5 >>> 32);
            }

            RenderSystem.getDevice().createCommandEncoder().writeToBuffer(this.llIlliIill.slice(0L, (long)((int)(var5 >>> 32))), var2);
         } else {
            this.IiIlliIill = 0;
         }
      }
   }
}
