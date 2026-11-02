package gg.corz;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.systems.RenderSystem.class_5590;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTextureView;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.minecraft.class_1044;
import net.minecraft.class_1059;
import net.minecraft.class_11515;
import net.minecraft.class_11659;
import net.minecraft.class_12137;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_276;
import net.minecraft.class_2806;
import net.minecraft.class_310;
import net.minecraft.class_4604;
import net.minecraft.class_4722;
import net.minecraft.class_2338.class_2339;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.system.MemoryUtil;

public final class IIlIllIilIlIllIi implements AutoCloseable {
   private final LongOpenHashSet llililIIIi;
   private final List<IlilIlIillilIlIi> ilililIIIi;
   private final Long2ObjectOpenHashMap<IlilIlIillilIlIi> lillilIIIi = new Long2ObjectOpenHashMap();
   private ByteBuffer ilIiilIIIi;
   private static final class_11515[] IIliilIIIi = class_11515.values();
   private final LongOpenHashSet iIIiilIIIi;
   private static final int lIliilIIIi = 32;
   private final List<GpuBufferSlice> iiililIIIi;
   private final List<GpuBufferSlice> liililIIIi;
   private final lIIlliiIIlli lIililIIIi;
   private final IiIliiiliIliii iIililIIIi;
   private final LongOpenHashSet IlililIIIi;
   private GpuBuffer IiIiilIIIi;
   private GpuBuffer liIiilIIIi;
   private static final Vector4f llliilIIIi = new Vector4f(1.0F, 1.0F, 1.0F, 1.0F);
   private static final Matrix4f IiliilIIIi = new Matrix4f();
   private final Long2ByteOpenHashMap iillilIIIi = new Long2ByteOpenHashMap();
   private final LongArrayList lIIiilIIIi;
   private static final class_2350[] IlliilIIIi = class_2350.values();
   private final List<GpuBufferSlice> IiililIIIi;
   private static final long iIliilIIIi = 8333333L;
   private long IlIiilIIIi;
   private static final Vector3f illiilIIIi = new Vector3f();
   private boolean iiIiilIIIi;
   private final Long2ObjectOpenHashMap<class_2680> IIililIIIi = new Long2ObjectOpenHashMap();
   private long llIiilIIIi;
   private final List<int[]> IIIiilIIIi;

   private void Iilllilliill(IlilIlIillilIlIi sec, class_310 mc) {
      long var19 = -3663200626596306337L;
      long var21 = -7781727964904800791L;
      long var23 = -8601115016398119389L;
      long var25 = 8927275907875160705L;
      long var27 = 3812798601115283735L;
      long var29 = -1337339063008729314L;
      var19 ^= (
            (long)(mc.field_1687.method_2935().method_2857(sec.IIliIIIIIi >> 4, sec.iIliIIIIIi >> 4, class_2806.field_12803, false) != null ? 1 : 0) << 32
               ^ var19
         )
         & -1L << 32;
      if ((int)(var19 >>> 32) == 0) {
         sec.iliiIIIIIi++;
      } else {
         this.lIIiilIIIi.clear();
         this.iIIiilIIIi.clear();
         var19 ^= ((long)(this.IIIiilIIIi.size() != 1 ? 1 : 0) ^ var19) & -1L >>> 32;
         class_2339 var5 = new class_2339();
         var21 ^= (0L ^ var21) & -1L << 32;

         while ((int)(var21 >>> 32) < this.IIIiilIIIi.size()) {
            int[] var7 = this.IIIiilIIIi.get((int)(var21 >>> 32));
            var21 ^= ((long)Math.max(var7[0], sec.IIliIIIIIi) ^ var21) & -1L >>> 32;
            var23 ^= ((long)Math.min(var7[3], sec.IIliIIIIIi + 15) << 32 ^ var23) & -1L << 32;
            var23 ^= ((long)Math.max(var7[1], sec.lIliIIIIIi) ^ var23) & -1L >>> 32;
            var25 ^= ((long)Math.min(var7[4], sec.lIliIIIIIi + 15) << 32 ^ var25) & -1L << 32;
            var25 ^= ((long)Math.max(var7[2], sec.iIliIIIIIi) ^ var25) & -1L >>> 32;
            var27 ^= ((long)Math.min(var7[5], sec.iIliIIIIIi + 15) << 32 ^ var27) & -1L << 32;
            if ((int)var21 <= (int)(var23 >>> 32) && (int)var23 <= (int)(var25 >>> 32) && (int)var25 <= (int)(var27 >>> 32)) {
               for (var27 ^= ((long)((int)var23) ^ var27) & -1L >>> 32; (int)var27 <= (int)(var25 >>> 32); var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
                  var29 ^= ((long)((int)var25) << 32 ^ var29) & -1L << 32;

                  while ((int)(var29 >>> 32) <= (int)(var27 >>> 32)) {
                     for (var29 ^= ((long)((int)var21) ^ var29) & -1L >>> 32;
                        (int)var29 <= (int)(var23 >>> 32);
                        var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32
                     ) {
                        long var17 = class_2338.method_10064((int)var29, (int)var27, (int)(var29 >>> 32));
                        if (!this.IIililIIIi.containsKey(var17) && ((int)var19 == 0 || !this.iIIiilIIIi.contains(var17))) {
                           var5.method_10103((int)var29, (int)var27, (int)(var29 >>> 32));
                           if (!mc.field_1687.method_8320(var5).method_26215()) {
                              this.lIIiilIIIi.add(var17);
                              if ((int)var19 != 0) {
                                 this.iIIiilIIIi.add(var17);
                              }
                           }
                        }
                     }

                     var29 += 4294967296L;
                  }
               }
            }

            var21 += 4294967296L;
         }

         if (!this.lIIiilIIIi.isEmpty()) {
            sec.iiliIIIIIi = this.lIIiilIIIi.toLongArray();
            sec.lliiIIIIIi = sec.lliiIIIIIi + sec.iiliIIIIIi.length;
         }
      }
   }

   public boolean IiIlliIliiIl(
      IlIlilillIlili expected, class_243 queue, List<class_2338> cfg, List<class_2680> accent, int positions, class_11659 cam, float tickDelta
   ) {
      if (this.iiIiilIIIi && !this.lillilIIIi.isEmpty()) {
         class_310 var8 = class_310.method_1551();
         if (var8.field_1687 == null) {
            return false;
         } else {
            long var9 = expected.IliIlllilIi();
            if (var9 != this.IlIiilIIIi) {
               this.IlIiilIIIi = var9;
               this.IIIllIIliIIl();
            }

            this.iIililIIIi.IliIlllilIi(this.lillilIIIi.size());
            this.llIiilIIIi = IlilIlIillilIlIi.IliIlllilIi(
               (int)Math.floor(queue.field_1352), (int)Math.floor(queue.field_1351), (int)Math.floor(queue.field_1350)
            );
            class_4604 var11 = this.Iiiiliiiiiii(queue);
            double var12 = (double)expected.IIiIllIiIl();
            this.ilililIIIi.clear();
            ObjectIterator var14 = this.lillilIIIi.values().iterator();

            while (var14.hasNext()) {
               IlilIlIillilIlIi var15 = (IlilIlIillilIlIi)var14.next();
               var15.IlIIlIIIIi = false;
               var15.llIIlIIIIi = var15.liiiIIllIl(queue.field_1352, queue.field_1351, queue.field_1350);
               double var16 = var12 + 13.86;
               if (var15.llIIlIIIIi > var16 * var16) {
                  this.iIililIIIi.IiilIIIlIl++;
               } else if (!expected.IlIillIiilIi(var15.lIliIIIIIi)) {
                  this.iIililIIIi.IiilIIIlIl++;
               } else if (var11 != null && !var11.method_23093(var15.IlliIIIIIi)) {
                  this.iIililIIIi.ililIIIlIl++;
               } else {
                  var15.IlIIlIIIIi = true;
                  this.ilililIIIi.add(var15);
               }
            }

            this.ilililIIIi.sort((b, a) -> Double.compare(a.llIIlIIIIi, b.llIIlIIIIi));
            this.iIililIIIi.IlilIIIlIl = this.ilililIIIi.size();
            this.iIililIIIi.llilIIIlIl = this.llililIIIi.size();
            this.IIlllIlliIll(expected, cfg, accent, positions, queue);
            this.iIililIIIi.lIIiIIIlIl = 0;
            this.iIililIIIi.iIIiIIIlIl = 0;

            for (IlilIlIillilIlIi var21 : this.ilililIIIi) {
               this.iIililIIIi.lIIiIIIlIl = this.iIililIIIi.lIIiIIIlIl + var21.IiliIIIIIi.length;
               this.iIililIIIi.iIIiIIIlIl = this.iIililIIIi.iIIiIIIlIl + var21.liliIIIIIi;
            }

            this.iIililIIIi.liiiIIllIl();
            var14 = this.lillilIIIi.values().iterator();

            while (var14.hasNext()) {
               IlilIlIillilIlIi var22 = (IlilIlIillilIlIi)var14.next();
               this.iIililIIIi.llIiIIIlIl = this.iIililIIIi.llIiIIIlIl + var22.lIiiIIIIIi;
               this.iIililIIIi.ilIiIIIlIl = this.iIililIIIi.ilIiIIIlIl + var22.iIiiIIIIIi + var22.IliiIIIIIi;
               this.iIililIIIi.IiIiIIIlIl = this.iIililIIIi.IiIiIIIlIl + var22.IIiiIIIIIi;
            }

            try {
               this.IIillIiliIil(expected, queue);
               return true;
            } catch (Throwable var18) {
               this.iiIiilIIIi = false;
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void IIlllIlliIll(IlIlilillIlili cfg, List<class_2338> accent, List<class_2680> positions, int cam, class_243 expected) {
      long var17 = -7258682338411996264L;
      if (!this.llililIIIi.isEmpty() || !this.IlililIIIi.isEmpty()) {
         class_310 var6 = class_310.method_1551();
         ArrayList var7 = new ArrayList();

         for (IlilIlIillilIlIi var9 : this.ilililIIIi) {
            var17 ^= ((long)this.llililIIIi.contains(var9.iiIiIIIIIi) << 32 ^ var17) & -1L << 32;
            if (((int)(var17 >>> 32) != 0 || this.IlililIIIi.contains(var9.iiIiIIIIIi))
               && (
                  (int)(var17 >>> 32) != 0
                     || !var9.liiiIIIIIi
                     || var6.field_1687.method_2935().method_2857(var9.IIliIIIIIi >> 4, var9.iIliIIIIIi >> 4, class_2806.field_12803, false) != null
               )) {
               var7.add(var9);
            }
         }

         if (var7.size() < cfg.iIiIlIliIl()) {
            LongIterator var19 = this.llililIIIi.iterator();

            while (var19.hasNext()) {
               long var21 = (Long)var19.next();
               IlilIlIillilIlIi var11 = (IlilIlIillilIlIi)this.lillilIIIi.get(var21);
               if (var11 != null && !var11.IlIIlIIIIi) {
                  var11.llIIlIIIIi = var11.liiiIIllIl(expected.field_1352, expected.field_1351, expected.field_1350);
                  var7.add(var11);
               }
            }
         }

         if (!var7.isEmpty()) {
            var7.sort((b, a) -> Double.compare(b.llIIlIIIIi, a.llIIlIIIIi));
            lIlIIiIliIlIIiIl var20 = new lIlIIiIliIlIIiIl(var6.field_1687, this.IIililIIIi, cfg);
            IllIIlilllIIli var22 = new IllIIlilllIIli(
               accent, positions, this.iillilIIIi, var20, cfg, cam, cfg.IlIllllIll(), cfg.ilIllIiIll(), cfg.liIlliiIll(), cfg.IIllllIlll(), cfg.iIlllIllll()
            );
            var17 ^= ((long)cfg.iIiIlIliIl() << 32 ^ var17) & -1L << 32;
            long var23 = System.nanoTime();
            long var13 = var23 + 8333333L;

            for (IlilIlIillilIlIi var16 : var7) {
               int var10000 = (int)(var17 >>> 32);
               var17 += -4294967296L;
               if (var10000 <= 0 || this.iIililIIIi.liilIIIlIl > 0 && System.nanoTime() > var13) {
                  break;
               }

               if (this.IlililIIIi.contains(var16.iiIiIIIIIi)) {
                  this.Illlllllilll(var16, accent, positions, var6, cfg);
                  this.iIililIIIi.iiilIIIlIl++;
               }

               this.lIililIIIi.IliIlllilIi(var16, var22);
               var16.IiiiIIIIIi = false;
               this.llililIIIi.remove(var16.iiIiIIIIIi);
               if (var16.iliiIIIIIi == 0) {
                  this.IlililIIIi.remove(var16.iiIiIIIIIi);
               }

               this.iIililIIIi.liilIIIlIl++;
            }

            this.iIililIIIi.IlIiIIIlIl = System.nanoTime() - var23;
         }
      }
   }

   private class_4604 Iiiiliiiiiii(class_243 cam) {
      return iliiiiiIiiiiii.liiiIIllIl();
   }

   private void Iilililiiili(CommandEncoder cfg, IlIlilillIlili enc) {
      if (this.ilIiilIIIi == null) {
         this.ilIiilIIIi = MemoryUtil.memAlloc(32);
         this.IiIiilIIIi = RenderSystem.getDevice()
            .createBuffer(() -> iIiIlIliIl<"iIiIlIliIl","lh9TvfbivHdEJkxyamVc6JdsaQR3kusWTBwoR0xDswmq50HHSHPLOensolo1yB4=">(), 136, 32L);
         this.liIiilIIIi = RenderSystem.getDevice()
            .createBuffer(() -> iIiIlIliIl<"iIiIlIliIl","Czc9IHATN/TlEtwuE3pAoFMknN8KIQ4x51kI3DAvmI2iUcRLyWQfbiC+UoVjvkc1HY/h">(), 136, 32L);
      }

      if (enc.liiiIIllIl()) {
         this.IIiilIiiiIii(cfg, this.IiIiilIIIi, 1.0F, 0.0F, 1.0F, 1.0F);
         this.IIiilIiiiIii(cfg, this.liIiilIIIi, 1.0F, 0.0F, 1.0F, 1.0F);
      } else {
         float var3 = this.Iliilliiilii(enc);
         float var4 = enc.Illlllllilll(var3);
         float var5 = enc.Iilllilliill(var3);
         float var6 = enc.IIillIiliIil();
         this.IIiilIiiiIii(cfg, this.IiIiilIIIi, enc.IIiilIiiiIii(), var4, var5, var6);
         this.IIiilIiiiIii(cfg, this.liIiilIIIi, enc.iIIIlIlIIl(), 0.0F, 0.0F, 1.0F);
      }
   }

   private void IIIilIIiiIIi(
      CommandEncoder chestView,
      class_276 enc,
      IlIlilillIlili atlasView,
      class_243 opacity,
      RenderPipeline occluded,
      GpuTextureView chestSampler,
      class_12137 cam,
      GpuTextureView cfg,
      class_12137 atlasSampler,
      float fb,
      boolean pipeline
   ) {
      long var18 = -6660569055939286876L;
      long var20 = -3760431661952186143L;
      if (!(fb <= 0.003F)) {
         GpuBuffer var12 = pipeline ? this.liIiilIIIi : this.IiIiilIIIi;
         if (var12 != null) {
            RenderPass var13 = chestView.createRenderPass(
               () -> iIiIlIliIl<"iIiIlIliIl","CV6fYfqlIPhtOAjQCJu58cX2p6lhAT9HtnL8O18O3QgqWZ4tYTXUrnW1xEc=">(),
               enc.method_71639(),
               OptionalInt.empty(),
               enc.method_71640(),
               OptionalDouble.empty()
            );

            try {
               var13.setPipeline(occluded);
               RenderSystem.bindDefaultUniforms(var13);
               var13.bindTexture(iIiIlIliIl<"iIiIlIliIl","KfDpXDZn0g9UnPvjk+R+Y3twBvxtcecHG+t+tMaQ8NimExmH">(), chestSampler, cam);
               var13.setUniform(iIiIlIliIl<"iIiIlIliIl","QEOPZxZRvhTiY0e9jtjAa2+Z1QlugbdayR9TY9Xk+YxMPmYTOxZPouk=">(), var12);
               class_11515[] var14 = IIliilIIIi;
               var18 ^= ((long)var14.length << 32 ^ var18) & -1L << 32;

               for (var18 ^= (0L ^ var18) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
                  class_11515 var17 = var14[(int)var18];
                  if (!var17.method_72023()) {
                     this.IlIillIiilIi(var13, var17);
                  }
               }

               var14 = IIliilIIIi;
               var18 ^= ((long)var14.length << 32 ^ var18) & -1L << 32;

               for (var18 ^= (0L ^ var18) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
                  class_11515 var26 = var14[(int)var18];
                  if (var26.method_72023()) {
                     this.IlIillIiilIi(var13, var26);
                  }
               }

               if (cfg != null && atlasSampler != null) {
                  var20 ^= (0L ^ var20) & -1L << 32;

                  for (IlilIlIillilIlIi var16 : this.ilililIIIi) {
                     if (var16.IIIIlIIIIi != null && !var16.IIIIlIIIIi.IliIlllilIi()) {
                        var20 ^= (4294967296L ^ var20) & -1L << 32;
                        break;
                     }
                  }

                  if ((int)(var20 >>> 32) != 0) {
                     var13.bindTexture(iIiIlIliIl<"iIiIlIliIl","KfDpXDZn0g9UnPvjk+R+Y3twBvxtcecHG+t+tMaQ8NimExmH">(), cfg, atlasSampler);

                     for (long var31 = var18 ^ (0L ^ var18) & -1L << 32; (int)(var31 >>> 32) < this.ilililIIIi.size(); var31 += 4294967296L) {
                        Iililllllilillll var25 = this.ilililIIIi.get((int)(var31 >>> 32)).IIIIlIIIIi;
                        if (var25 != null && !var25.IliIlllilIi()) {
                           this.IIlilIliiIli(var13, (int)(var31 >>> 32), false);
                           this.Illillliilli(var13, var25);
                        }
                     }
                  }
               }
            } catch (Throwable var23) {
               if (var13 != null) {
                  try {
                     var13.close();
                  } catch (Throwable var22) {
                     var23.addSuppressed(var22);
                  }
               }

               throw var23;
            }

            if (var13 != null) {
               var13.close();
            }
         }
      }
   }

   public void IIIllIIliIIl() {
      ObjectIterator var1 = this.lillilIIIi.values().iterator();

      while (var1.hasNext()) {
         IlilIlIillilIlIi var2 = (IlilIlIillilIlIi)var1.next();
         var2.IiiiIIIIIi = true;
         this.IlililIIIi.add(var2.iiIiIIIIIi);
         this.llililIIIi.add(var2.iiIiIIIIIi);
      }
   }

   public void iIlIlllllill(int y, int x, int z) {
      if (this.IilliliilIIi(y, x, z)) {
         this.iliIiiliiiii(IlilIlIillilIlIi.IliIlllilIi(y, x, z));
         if ((y & 15) == 0) {
            this.iliIiiliiiii(IlilIlIillilIlIi.IliIlllilIi(y - 1, x, z));
         }

         if ((y & 15) == 15) {
            this.iliIiiliiiii(IlilIlIillilIlIi.IliIlllilIi(y + 1, x, z));
         }

         if ((x & 15) == 0) {
            this.iliIiiliiiii(IlilIlIillilIlIi.IliIlllilIi(y, x - 1, z));
         }

         if ((x & 15) == 15) {
            this.iliIiiliiiii(IlilIlIillilIlIi.IliIlllilIi(y, x + 1, z));
         }

         if ((z & 15) == 0) {
            this.iliIiiliiiii(IlilIlIillilIlIi.IliIlllilIi(y, x, z - 1));
         }

         if ((z & 15) == 15) {
            this.iliIiiliiiii(IlilIlIillilIlIi.IliIlllilIi(y, x, z + 1));
         }
      }
   }

   private void IIlilIliiIli(RenderPass occluded, int sectionIndex, boolean pass) {
      List var4 = pass && sectionIndex < this.liililIIIi.size() ? this.liililIIIi : this.IiililIIIi;
      occluded.setUniform(iIiIlIliIl<"iIiIlIliIl","3bp+HJoxICYf5JWYGvtVAXWJn7oayUCykJ2aW2Rq3xjXZUnY1OYq4vgyqh/B">(), (GpuBufferSlice)var4.get(sectionIndex));
   }

   public void liiiIIllIl(List<class_2338> positions, List<class_2680> expected, List<int[]> boxes) {
      long var19 = 5647560935958454698L;
      long var21 = -5011943442758885701L;
      this.IIIIllIIIl();
      this.iillilIIIi.clear();
      this.IIililIIIi.clear();
      this.IlililIIIi.clear();
      this.llililIIIi.clear();
      this.IIIiilIIIi.clear();
      this.IIIiilIIIi.addAll(boxes);
      this.IIililIIIi.ensureCapacity(positions.size());
      Long2ObjectOpenHashMap var4 = new Long2ObjectOpenHashMap();

      for (var19 ^= (0L ^ var19) & -1L << 32; (int)(var19 >>> 32) < positions.size(); var19 += 4294967296L) {
         class_2338 var6 = (class_2338)positions.get((int)(var19 >>> 32));
         class_2680 var7 = (class_2680)expected.get((int)(var19 >>> 32));
         if (var7 != null) {
            this.IIililIIIi.put(var6.method_10063(), var7);
            long var8 = IlilIlIillilIlIi.IliIlllilIi(var6.method_10263(), var6.method_10264(), var6.method_10260());
            IlilIlIillilIlIi var10 = (IlilIlIillilIlIi)this.lillilIIIi.get(var8);
            if (var10 == null) {
               var10 = new IlilIlIillilIlIi(var8, var6.method_10263() >> 4 << 4, var6.method_10264() >> 4 << 4, var6.method_10260() >> 4 << 4);
               this.lillilIIIi.put(var8, var10);
            }

            ((IntArrayList)var4.computeIfAbsent(var8, k -> new IntArrayList())).add((int)(var19 >>> 32));
         }
      }

      var19 ^= (1125899906842624L ^ var19) & -1L << 32;

      for (int[] var25 : this.IIIiilIIIi) {
         long var27 = (long)(var25[3] >> 4) - (long)(var25[0] >> 4) + 1L;
         long var30 = (long)(var25[4] >> 4) - (long)(var25[1] >> 4) + 1L;
         long var12 = (long)(var25[5] >> 4) - (long)(var25[2] >> 4) + 1L;
         if (var27 * var30 * var12 <= 262144L) {
            for (var19 ^= ((long)(var25[0] >> 4) ^ var19) & -1L >>> 32; (int)var19 <= var25[3] >> 4; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
               var21 ^= ((long)(var25[1] >> 4) << 32 ^ var21) & -1L << 32;

               while ((int)(var21 >>> 32) <= var25[4] >> 4) {
                  for (var21 ^= ((long)(var25[2] >> 4) ^ var21) & -1L >>> 32; (int)var21 <= var25[5] >> 4; var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
                     long var17 = class_2338.method_10064((int)var19, (int)(var21 >>> 32), (int)var21);
                     if (!this.lillilIIIi.containsKey(var17)) {
                        this.lillilIIIi.put(var17, new IlilIlIillilIlIi(var17, (int)var19 << 4, (int)(var21 >>> 32) << 4, (int)var21 << 4));
                     }
                  }

                  var21 += 4294967296L;
               }
            }
         }
      }

      ObjectIterator var24 = this.lillilIIIi.values().iterator();

      while (var24.hasNext()) {
         IlilIlIillilIlIi var26 = (IlilIlIillilIlIi)var24.next();
         IntArrayList var28 = (IntArrayList)var4.get(var26.iiIiIIIIIi);
         var26.llliIIIIIi = var28 == null ? new int[0] : var28.toIntArray();
         var26.illiIIIIIi = new byte[var26.llliIIIIIi.length];
         Arrays.fill(var26.illiIIIIIi, (byte)IIlIlIllIlIlIl.IliIIIIlllliIIIIll.ordinal());
         var26.IiiiIIIIIi = true;
         this.IlililIIIi.add(var26.iiIiIIIIIi);
         this.llililIIIi.add(var26.iiIiIIIIIi);
      }
   }

   public IIlIllIilIlIllIi() {
      this.lIililIIIi = new lIIlliiIIlli();
      this.iIililIIIi = new IiIliiiliIliii();
      this.IlililIIIi = new LongOpenHashSet();
      this.llililIIIi = new LongOpenHashSet();
      this.ilililIIIi = new ArrayList<>();
      this.IiililIIIi = new ArrayList<>();
      this.liililIIIi = new ArrayList<>();
      this.iiililIIIi = new ArrayList<>();
      this.IIIiilIIIi = new ArrayList<>();
      this.lIIiilIIIi = new LongArrayList();
      this.iIIiilIIIi = new LongOpenHashSet();
      this.IlIiilIIIi = Long.MIN_VALUE;
      this.iiIiilIIIi = true;
   }

   public void iIIIlIlIIl() {
      this.IIIIllIIIl();
      this.iillilIIIi.clear();
      this.IIililIIIi.clear();
      this.IlililIIIi.clear();
      this.llililIIIi.clear();
      this.ilililIIIi.clear();
      this.IiililIIIi.clear();
      this.liililIIIi.clear();
      this.iiililIIIi.clear();
      this.IIIiilIIIi.clear();
      this.IlIiilIIIi = Long.MIN_VALUE;
      this.iiIiilIIIi = true;
   }

   private float Iliilliiilii(IlIlilillIlili cfg) {
      long var10 = -9023182881690394112L;
      long var12 = 102709324396829813L;
      IlilIlIillilIlIi var2 = (IlilIlIillilIlIi)this.lillilIIIi.get(this.llIiilIIIi);
      if (var2 == null) {
         return 1.0F;
      } else {
         var10 ^= ((long)var2.llliIIIIIi.length << 32 ^ var10) & -1L << 32;
         var10 ^= (1L ^ var10) & -1L >>> 32;
         class_2350[] var5 = IlliilIIIi;
         var12 ^= ((long)var5.length << 32 ^ var12) & -1L << 32;

         for (long var19 = var12 ^ (0L ^ var12) & -1L >>> 32; (int)var19 < (int)(var19 >>> 32); var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
            class_2350 var8 = var5[(int)var19];
            IlilIlIillilIlIi var9 = (IlilIlIillilIlIi)this.lillilIIIi
               .get(
                  IlilIlIillilIlIi.IliIlllilIi(
                     var2.IIliIIIIIi + var8.method_10148() * 16 + 8,
                     var2.lIliIIIIIi + var8.method_10164() * 16 + 8,
                     var2.iIliIIIIIi + var8.method_10165() * 16 + 8
                  )
               );
            if (var9 != null) {
               var10 ^= ((long)((int)(var10 >>> 32) + var9.llliIIIIIi.length) << 32 ^ var10) & -1L << 32;
               var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32;
            }
         }

         float var14 = (float)((int)(var10 >>> 32)) / (float)((int)var10 * 4096);
         return 1.0F + Math.min(1.0F, var14 * 2.2F);
      }
   }

   private void IlIillIiilIi(RenderPass pass, class_11515 layer) {
      long var5 = 7244907021239225365L;

      for (long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < this.ilililIIIi.size(); var7 += 4294967296L) {
         Iililllllilillll var4 = this.ilililIIIi.get((int)(var7 >>> 32)).iiiiIIIIIi[layer.ordinal()];
         if (var4 != null && !var4.IliIlllilIi()) {
            this.IIlilIliiIli(pass, (int)(var7 >>> 32), false);
            this.Illillliilli(pass, var4);
         }
      }
   }

   private void Illillliilli(RenderPass mesh, Iililllllilillll pass) {
      mesh.setVertexBuffer(0, pass.liiiIIllIl());
      class_5590 var3 = RenderSystem.getSequentialBuffer(pass.liIlliIill);
      mesh.setIndexBuffer(var3.method_68274(pass.IiIlliIill), var3.method_31924());
      mesh.drawIndexed(0, 0, pass.IiIlliIill, 1);
      this.iIililIIIi.IIIiIIIlIl++;
   }

   private void IIiilIiiiIii(CommandEncoder fadeEnd, GpuBuffer opacity, float buf, float enc, float minAlpha, float fadeStart) {
      this.ilIiilIIIi.clear();
      this.ilIiilIIIi.putFloat(1.0F).putFloat(1.0F).putFloat(1.0F).putFloat(buf);
      this.ilIiilIIIi.putFloat(enc).putFloat(minAlpha).putFloat(fadeStart).putFloat(0.06F);
      this.ilIiilIIIi.flip();
      fadeEnd.writeToBuffer(opacity.slice(0L, 32L), this.ilIiilIIIi);
   }

   private static RenderPipeline Iiilliiliiil(class_11515 layer) {
      return switch (layer) {
         case field_60923 -> lillllIiiillllIi.IllliiIIIi;
         case field_60925 -> lillllIiiillllIi.lllliiIIIi;
         case field_60926, field_60927 -> lillllIiiillllIi.illliiIIIi;
         default -> throw new MatchException(null, null);
      };
   }

   private void Ililllililil(
      CommandEncoder atlasSampler,
      class_276 atlasView,
      IlIlilillIlili fb,
      class_310 chestSampler,
      GpuTextureView mc,
      class_12137 cfg,
      GpuTextureView chestView,
      class_12137 enc
   ) {
      long var20 = 95321637700332746L;
      long var22 = 5896639869462307296L;
      long var24 = -583216029931563910L;
      long var26 = -5606791338418243915L;
      var20 ^= (0L ^ var20) & -1L << 32;

      for (IlilIlIillilIlIi var11 : this.ilililIIIi) {
         Iililllllilillll[] var12 = var11.iiiiIIIIIi;
         var20 ^= ((long)var12.length ^ var20) & -1L >>> 32;

         for (var22 ^= (0L ^ var22) & -1L << 32; (int)(var22 >>> 32) < (int)var20; var22 += 4294967296L) {
            Iililllllilillll var15 = var12[(int)(var22 >>> 32)];
            if (var15 != null && !var15.IliIlllilIi()) {
               var20 ^= (4294967296L ^ var20) & -1L << 32;
               break;
            }
         }

         if ((int)(var20 >>> 32) != 0 || var11.IIIIlIIIIi != null && !var11.IIIIlIIIIi.IliIlllilIi()) {
            var20 ^= (4294967296L ^ var20) & -1L << 32;
            break;
         }
      }

      var22 ^= ((long)fb.Iillllilll() ^ var22) & -1L >>> 32;
      if ((int)(var20 >>> 32) != 0 && fb.IIiilIiiiIii() > 0.003F) {
         GpuTextureView var30 = chestSampler.field_1773.method_22974().method_71650();
         class_12137 var31 = RenderSystem.getSamplerCache().method_75294(FilterMode.LINEAR);
         RenderPass var13 = atlasSampler.createRenderPass(
            () -> iIiIlIliIl<"iIiIlIliIl","KeCSGgSCQUxQJqv4NjK7oAvOPwi6o9uS8l47y8Q6dAzkJZ0A2suEpBSs">(),
            atlasView.method_71639(),
            OptionalInt.empty(),
            atlasView.method_71640(),
            OptionalDouble.empty()
         );

         try {
            RenderSystem.bindDefaultUniforms(var13);
            var13.bindTexture(iIiIlIliIl<"iIiIlIliIl","SEpi0m7uPwvVhtd80hcW17p2KllpSbpr/za3Efylh2/plWgp">(), var30, var31);
            var13.bindTexture(iIiIlIliIl<"iIiIlIliIl","KfDpXDZn0g9UnPvjk+R+Y3twBvxtcecHG+t+tMaQ8NimExmH">(), mc, cfg);
            class_11515[] var14 = IIliilIIIi;
            var24 ^= ((long)var14.length << 32 ^ var24) & -1L << 32;

            for (var24 ^= (0L ^ var24) & -1L >>> 32; (int)var24 < (int)(var24 >>> 32); var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
               class_11515 var17 = var14[(int)var24];
               var13.setPipeline((int)var22 != 0 ? lillllIiiillllIi.illliiIIIi : Iiilliiliiil(var17));

               for (var26 ^= (0L ^ var26) & -1L << 32; (int)(var26 >>> 32) < this.ilililIIIi.size(); var26 += 4294967296L) {
                  Iililllllilillll var19 = this.ilililIIIi.get((int)(var26 >>> 32)).iiiiIIIIIi[var17.ordinal()];
                  if (var19 != null && !var19.IliIlllilIi()) {
                     var13.setUniform(
                        iIiIlIliIl<"iIiIlIliIl","3bp+HJoxICYf5JWYGvtVAXWJn7oayUCykJ2aW2Rq3xjXZUnY1OYq4vgyqh/B">(), this.iiililIIIi.get((int)(var26 >>> 32))
                     );
                     this.Illillliilli(var13, var19);
                  }
               }
            }

            if (chestView != null && enc != null) {
               var22 ^= (0L ^ var22) & -1L << 32;

               for (long var37 = var24 ^ (0L ^ var24) & -1L << 32; (int)(var37 >>> 32) < this.ilililIIIi.size(); var37 += 4294967296L) {
                  Iililllllilillll var16 = this.ilililIIIi.get((int)(var37 >>> 32)).IIIIlIIIIi;
                  if (var16 != null && !var16.IliIlllilIi()) {
                     if ((int)(var22 >>> 32) == 0) {
                        var13.setPipeline((int)var22 != 0 ? lillllIiiillllIi.illliiIIIi : lillllIiiillllIi.IllliiIIIi);
                        var13.bindTexture(iIiIlIliIl<"iIiIlIliIl","KfDpXDZn0g9UnPvjk+R+Y3twBvxtcecHG+t+tMaQ8NimExmH">(), chestView, enc);
                        var22 ^= (4294967296L ^ var22) & -1L << 32;
                     }

                     var13.setUniform(
                        iIiIlIliIl<"iIiIlIliIl","3bp+HJoxICYf5JWYGvtVAXWJn7oayUCykJ2aW2Rq3xjXZUnY1OYq4vgyqh/B">(), this.iiililIIIi.get((int)(var37 >>> 32))
                     );
                     this.Illillliilli(var13, var16);
                  }
               }
            }
         } catch (Throwable var29) {
            if (var13 != null) {
               try {
                  var13.close();
               } catch (Throwable var28) {
                  var29.addSuppressed(var28);
               }
            }

            throw var29;
         }

         if (var13 != null) {
            var13.close();
         }
      }

      var26 ^= ((long)fb.IllIllllIl() ^ var26) & -1L >>> 32;
      if (fb.illIlIilIl()) {
         this.IiIiliIiiiIi(atlasSampler, atlasView, fb, null, (int)var26 != 0 ? lillllIiiillllIi.lilliiIIIi : Iiliillliliill.ilIllllIiIiIllllIi, false, true);
      }

      this.IiIiliIiiiIi(atlasSampler, atlasView, fb, null, (int)var26 != 0 ? lillllIiiillllIi.IilliiIIIi : Iiliillliliill.lIIllllIiiIIllllIi, false, false);
   }

   private boolean IilliliilIIi(int x, int y, int z) {
      return this.lIiiIiIlilli(x, y, z)
         || this.IIililIIIi.containsKey(class_2338.method_10064(x, y, z))
         || this.IIililIIIi.containsKey(class_2338.method_10064(x + 1, y, z))
         || this.IIililIIIi.containsKey(class_2338.method_10064(x - 1, y, z))
         || this.IIililIIIi.containsKey(class_2338.method_10064(x, y + 1, z))
         || this.IIililIIIi.containsKey(class_2338.method_10064(x, y - 1, z))
         || this.IIililIIIi.containsKey(class_2338.method_10064(x, y, z + 1))
         || this.IIililIIIi.containsKey(class_2338.method_10064(x, y, z - 1));
   }

   private boolean lIiiIiIlilli(int z, int y, int x) {
      long var6 = -7453247867354971834L;

      for (long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < this.IIIiilIIIi.size(); var8 += 4294967296L) {
         int[] var5 = this.IIIiilIIIi.get((int)(var8 >>> 32));
         if (z >= var5[0] && z <= var5[3] && y >= var5[1] && y <= var5[4] && x >= var5[2] && x <= var5[5]) {
            return true;
         }
      }

      return false;
   }

   public IiIliiiliIliii IlIlllIlilIl() {
      return this.iIililIIIi;
   }

   private void iliIiiliiiii(long key) {
      if (this.lillilIIIi.containsKey(key)) {
         this.IlililIIIi.add(key);
         this.llililIIIi.add(key);
      }
   }

   public void IliIlllilIi(List<class_2338> expected, List<class_2680> positions) {
      this.liiiIIllIl(expected, positions, List.of());
   }

   private void IIillIiliIil(IlIlilillIlili cfg, class_243 cam) {
      long var17 = 6990227717655027193L;
      class_310 var3 = class_310.method_1551();
      CommandEncoder var4 = RenderSystem.getDevice().createCommandEncoder();
      class_276 var5 = var3.method_1522();
      this.ilililIIIi.removeIf(IlilIlIillilIlIi::IIIllIIliIIl);
      this.iIililIIIi.IlilIIIlIl = this.ilililIIIi.size();
      this.IiililIIIi.clear();
      this.liililIIIi.clear();
      this.iiililIIIi.clear();
      var17 ^= ((long)cfg.liiiIIllIl() << 32 ^ var17) & -1L << 32;
      Vector4f var7 = new Vector4f(1.0F, 1.0F, 1.0F, cfg.Iillllilll() ? Math.max(0.0F, Math.min(1.0F, cfg.IIiilIiiiIii())) : 1.0F);
      Vector3f var8 = new Vector3f();
      var17 ^= ((long)cfg.IllIllllIl() ^ var17) & -1L >>> 32;
      Vector4f var10 = new Vector4f(1.0F, 1.0F, 1.0F, Math.max(0.0F, Math.min(1.0F, cfg.iIIIlIlIIl())));

      for (IlilIlIillilIlIi var12 : this.ilililIIIi) {
         Matrix4f var13 = new Matrix4f(RenderSystem.getModelViewMatrix());
         var13.translate(
            (float)((double)var12.IIliIIIIIi - cam.field_1352),
            (float)((double)var12.lIliIIIIIi - cam.field_1351),
            (float)((double)var12.iIliIIIIIi - cam.field_1350)
         );
         this.IiililIIIi.add(RenderSystem.getDynamicUniforms().method_71106(var13, llliilIIIi, illiilIIIi, IiliilIIIi));
         if ((int)var17 != 0) {
            this.liililIIIi.add(RenderSystem.getDynamicUniforms().method_71106(var13, var10, illiilIIIi, IiliilIIIi));
         }

         if ((int)(var17 >>> 32) != 0) {
            var8.set(
               (float)((double)var12.IIliIIIIIi - cam.field_1352),
               (float)((double)var12.lIliIIIIIi - cam.field_1351),
               (float)((double)var12.iIliIIIIIi - cam.field_1350)
            );
            this.iiililIIIi.add(RenderSystem.getDynamicUniforms().method_71106(RenderSystem.getModelViewMatrix(), var7, var8, IiliilIIIi));
         }
      }

      this.Iilililiiili(var4, cfg);
      class_1044 var20 = var3.method_1531().method_4619(class_1059.field_5275);
      GpuTextureView var21 = var20.method_71659();
      class_12137 var22 = var20.method_75484();
      GpuTextureView var14 = null;
      class_12137 var15 = null;

      try {
         class_1044 var16 = var3.method_1531().method_4619(class_4722.field_21709);
         if (var16 != null) {
            var14 = var16.method_71659();
            var15 = var16.method_75484();
         }
      } catch (Throwable var19) {
      }

      if ((int)(var17 >>> 32) != 0) {
         this.Ililllililil(var4, var5, cfg, var3, var21, var22, var14, var15);
      } else {
         if (cfg.IllIllllIl()) {
            this.IIIilIIiiIIi(var4, var5, cfg, cam, Iiliillliliill.iiiIlllIiIIIllllIi, var21, var22, var14, var15, cfg.iIIIlIlIIl(), true);
            this.IiIiliIiiiIi(var4, var5, cfg, cam, Iiliillliliill.IlIllllIillIllllIi, true, false);
            if (cfg.illIlIilIl()) {
               this.IiIiliIiiiIi(var4, var5, cfg, cam, Iiliillliliill.liIllllIiiiIllllIi, true, true);
            }
         }

         RenderPipeline var23 = Iiliillliliill.IiiIlllIiliiIlllIi;
         this.IIIilIIiiIIi(var4, var5, cfg, cam, var23, var21, var22, var14, var15, cfg.IIiilIiiiIii(), false);
         this.IiIiliIiiiIi(var4, var5, cfg, cam, Iiliillliliill.lIIllllIiiIIllllIi, false, false);
         if (cfg.illIlIilIl()) {
            this.IiIiliIiiiIi(var4, var5, cfg, cam, Iiliillliliill.ilIllllIiIiIllllIi, false, true);
         }
      }
   }

   private void Illlllllilll(IlilIlIillilIlIi expected, List<class_2338> sec, List<class_2680> cfg, class_310 mc, IlIlilillIlili positions) {
      long var16 = -5943385236488621514L;
      long var14 = 4381728955099234281L;
      expected.IIiiIIIIIi = expected.lIiiIIIIIi = expected.iIiiIIIIIi = expected.IliiIIIIIi = expected.lliiIIIIIi = expected.iliiIIIIIi = 0;
      var14 ^= ((long)positions.liiiIIllIl() << 32 ^ var14) & -1L << 32;
      var14 ^= (
            (long)(mc.field_1687.method_2935().method_2857(expected.IIliIIIIIi >> 4, expected.iIliIIIIIi >> 4, class_2806.field_12803, false) != null ? 1 : 0)
               ^ var14
         )
         & -1L >>> 32;
      expected.liiiIIIIIi = (int)var14 == 0;
      var16 ^= (0L ^ var16) & -1L << 32;

      while ((int)(var16 >>> 32) < expected.llliIIIIIi.length) {
         var16 ^= ((long)expected.llliIIIIIi[(int)(var16 >>> 32)] ^ var16) & -1L >>> 32;
         class_2338 var10 = (class_2338)sec.get((int)var16);
         class_2680 var11 = (class_2680)cfg.get((int)var16);
         class_2680 var12 = (int)var14 != 0 ? mc.field_1687.method_8320(var10) : null;
         IIlIlIllIlIlIl var13 = (int)(var14 >>> 32) != 0
            ? IIlIlIllIlIlIl.liiiIIllIl(var11, var12, (boolean)((int)var14))
            : IIlIlIllIlIlIl.IliIlllilIi(var11, var12, (boolean)((int)var14));
         expected.illiIIIIIi[(int)(var16 >>> 32)] = (byte)var13.ordinal();
         this.iillilIIIi.put(var10.method_10063(), (byte)var13.ordinal());
         switch (var13) {
            case iIlIIIIllIllIIIIll:
               expected.IIiiIIIIIi++;
               break;
            case lllIIIIllillIIIIll:
               expected.lIiiIIIIIi++;
               break;
            case IilIIIIlllilIIIIll:
               expected.iIiiIIIIIi++;
               break;
            case iilIIIIllIIiIIIIll:
               expected.IliiIIIIIi++;
               break;
            case lIiIIIIlliIiIIIIll:
               expected.lliiIIIIIi++;
               break;
            case IliIIIIlllliIIIIll:
               expected.iliiIIIIIi++;
         }

         var16 += 4294967296L;
      }

      expected.iiliIIIIIi = IlilIlIillilIlIi.liIIlIIIIi;
      if ((int)(var14 >>> 32) != 0 && !this.IIIiilIIIi.isEmpty()) {
         this.Iilllilliill(expected, mc);
      }
   }

   private void IiIiliIiiiIi(CommandEncoder outlines, class_276 cfg, IlIlilillIlili fb, class_243 pipeline, RenderPipeline occluded, boolean enc, boolean cam) {
      long var13 = -2668111194606316473L;
      var13 ^= (0L ^ var13) & -1L << 32;

      for (IlilIlIillilIlIi var10 : this.ilililIIIi) {
         Iililllllilillll var11 = cam ? var10.iIIIlIIIIi : var10.lIIIlIIIIi;
         if (var11 != null && !var11.IliIlllilIi()) {
            var13 ^= (4294967296L ^ var13) & -1L << 32;
            break;
         }
      }

      if ((int)(var13 >>> 32) != 0) {
         RenderPass var17 = outlines.createRenderPass(
            () -> iIiIlIliIl<"iIiIlIliIl","ESSgjtVaKdhScf4VMCEck3HqWWeKRdWBp1uMeNGE0dtn3IcC8tbDbd73Byybwg==">(),
            cfg.method_71639(),
            OptionalInt.empty(),
            cfg.method_71640(),
            OptionalDouble.empty()
         );

         try {
            var17.setPipeline(occluded);
            RenderSystem.bindDefaultUniforms(var17);
            if (!cam) {
               GpuBuffer var18 = enc ? this.liIiilIIIi : this.IiIiilIIIi;
               if (var18 != null) {
                  var17.setUniform(iIiIlIliIl<"iIiIlIliIl","QEOPZxZRvhTiY0e9jtjAa2+Z1QlugbdayR9TY9Xk+YxMPmYTOxZPouk=">(), var18);
               }
            }

            for (long var21 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var21 < this.ilililIIIi.size(); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
               IlilIlIillilIlIi var19 = this.ilililIIIi.get((int)var21);
               Iililllllilillll var12 = cam ? var19.iIIIlIIIIi : var19.lIIIlIIIIi;
               if (var12 != null && !var12.IliIlllilIi()) {
                  this.IIlilIliiIli(var17, (int)var21, enc);
                  this.Illillliilli(var17, var12);
               }
            }
         } catch (Throwable var16) {
            if (var17 != null) {
               try {
                  var17.close();
               } catch (Throwable var15) {
                  var16.addSuppressed(var15);
               }
            }

            throw var16;
         }

         if (var17 != null) {
            var17.close();
         }
      }
   }

   @Override
   public void close() {
      this.iIIIlIlIIl();
      this.lIililIIIi.close();
      if (this.IiIiilIIIi != null) {
         this.IiIiilIIIi.close();
         this.IiIiilIIIi = null;
      }

      if (this.ilIiilIIIi != null) {
         MemoryUtil.memFree(this.ilIiilIIIi);
         this.ilIiilIIIi = null;
      }
   }

   private void IIIIllIIIl() {
      ObjectIterator var1 = this.lillilIIIi.values().iterator();

      while (var1.hasNext()) {
         IlilIlIillilIlIi var2 = (IlilIlIillilIlIi)var1.next();
         var2.close();
      }

      this.lillilIIIi.clear();
   }
}
