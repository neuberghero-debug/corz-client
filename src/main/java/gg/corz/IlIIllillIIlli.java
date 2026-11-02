package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import net.minecraft.class_290;
import org.lwjgl.system.MemoryUtil;

public final class IlIIllillIIlli implements AutoCloseable {
   private GpuBuffer iiilllIIIl;
   private final int lIIillIIIl;
   private GpuBuffer liilllIIIl;
   private final int iIIillIIIl;
   private final int IIIillIIIl;
   private GpuBuffer IiilllIIIl;
   private boolean IlIillIIIl;

   public GpuBuffer iIlIlllllill() {
      return this.IlIillIIIl ? null : this.IiilllIIIl;
   }

   public static IlIIllillIIlli IliIlllilIi(iiIllIilIIlllIil solid, iiIllIilIIlllIil translucent, iiIllIilIIlllIil label, String chest) {
      if (class_290.field_1575.getVertexSize() != 24) {
         throw new IllegalStateException(
            Illlllllilll<"Illlllllilll","MEUJzsAY/85Xcdx7pVtuk3hN89PQJcZYHm9t8K5jtEruCb0eolIuyG1SUJc5rjCi6J6o">() + class_290.field_1575.getVertexSize()
         );
      } else {
         GpuBuffer var4 = liiiIIllIl(solid, chest + Illlllllilll<"Illlllllilll","yf7Ig7GLj8b3dPCPV2ZxGtePLHDtonD8qWnv/yZYHx7UoQ==">());
         GpuBuffer var5 = null;

         GpuBuffer var6;
         try {
            var5 = liiiIIllIl(translucent, chest + Illlllllilll<"Illlllllilll","5RCMpf8ImU53h92IyfJip6xV3GySQLj1oJfp3zQP/vxikgo8tKjFhA==">());
            var6 = liiiIIllIl(label, chest + Illlllllilll<"Illlllllilll","DjwXyavi0vjw+dUYxSAXukdg6SpdrDyS5ygBnWYinsFSEQ==">());
         } catch (Throwable var8) {
            if (var4 != null) {
               var4.close();
            }

            if (var5 != null) {
               var5.close();
            }

            throw var8;
         }

         return new IlIIllillIIlli(var4, solid.IlIlllIlilIl(), var5, translucent.IlIlllIlilIl(), var6, label == null ? 0 : label.IlIlllIlilIl());
      }
   }

   public boolean IiIlliIliiIl() {
      return this.IlIillIIIl;
   }

   public int iliIiiliiiii() {
      return this.IIIillIIIl;
   }

   @Override
   public void close() {
      if (!this.IlIillIIIl) {
         this.IlIillIIIl = true;
         if (this.IiilllIIIl != null) {
            try {
               this.IiilllIIIl.close();
            } catch (Throwable var4) {
            }

            this.IiilllIIIl = null;
         }

         if (this.liilllIIIl != null) {
            try {
               this.liilllIIIl.close();
            } catch (Throwable var3) {
            }

            this.liilllIIIl = null;
         }

         if (this.iiilllIIIl != null) {
            try {
               this.iiilllIIIl.close();
            } catch (Throwable var2) {
            }

            this.iiilllIIIl = null;
         }
      }
   }

   public int IlIlllIlilIl() {
      return this.iIIillIIIl;
   }

   private static GpuBuffer liiiIIllIl(iiIllIilIIlllIil sink, String label) {
      long var6 = -3782044517661849667L;
      if (sink != null && sink.IlIlllIlilIl() != 0 && sink.IiIlliIliiIl() != 0) {
         var6 ^= ((long)(sink.IlIlllIlilIl() * 24) << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) > sink.IiIlliIliiIl()) {
            throw new IllegalStateException(Illlllllilll<"Illlllllilll","sv7szdaoDOC5IlAPzrp6dlH1wwS1bf5nIaBckYV+xfyupVqqF57aPEfzprDiQhuiTHAGawRTVHSx1g==">());
         } else {
            ByteBuffer var3 = MemoryUtil.memAlloc((int)(var6 >>> 32) * 4);

            GpuBuffer var4;
            try {
               var3.asIntBuffer().put(sink.IIlllIlliIll(), 0, (int)(var6 >>> 32));
               var3.position(0).limit((int)(var6 >>> 32) * 4);
               var4 = RenderSystem.getDevice().createBuffer(() -> label, 32, var3);
            } finally {
               MemoryUtil.memFree(var3);
            }

            return var4;
         }
      } else {
         return null;
      }
   }

   public GpuBuffer lIiiIiIlilli() {
      return this.IlIillIIIl ? null : this.iiilllIIIl;
   }

   private IlIIllillIIlli(GpuBuffer translucent, int solidQuads, GpuBuffer translucentQuads, int chest, GpuBuffer solid, int chestQuads) {
      this.IiilllIIIl = translucent;
      this.IIIillIIIl = translucent == null ? 0 : solidQuads;
      this.liilllIIIl = translucentQuads;
      this.lIIillIIIl = translucentQuads == null ? 0 : chest;
      this.iiilllIIIl = solid;
      this.iIIillIIIl = solid == null ? 0 : chestQuads;
   }

   public GpuBuffer IilliliilIIi() {
      return this.IlIillIIIl ? null : this.liilllIIIl;
   }

   public int IIIllIIliIIl() {
      return this.lIIillIIIl;
   }
}
