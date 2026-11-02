package gg.corz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import net.minecraft.class_11659;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2404;
import net.minecraft.class_2415;
import net.minecraft.class_243;
import net.minecraft.class_2470;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public final class illIlIilIl {
   private iIilliIlIlilliIl illiIIlIiliIIl;
   private int liIIlIliiIIlIl;
   private int liliIIliiliIIl;
   private int lliiIIliliiIIl;
   private static final int llIiIIlilIiIIl = 300000;
   private int IlIIlIlllIIlIl;
   private int iilIlIlIIiIlIl;
   private int lIiIlIliIiIlIl;
   private final List<class_2338> IiIiIIlliIiIIl = new ArrayList<>();
   private static final int iliIlIlIiiIlIl = 77;
   private boolean iiiiIIlIIIIlIl;
   private int ilIIlIlIiIIlIl;
   private int IIlIlIllIlIlIl;
   private static final Set<illIlIilIl> IliIlIllliIlIl = Collections.newSetFromMap(new WeakHashMap<>());
   private int IiiiIIlliiiIIl;
   private static final int liiIlIliiiIlIl = 140;
   private int iIiiIIlIliiIIl;
   private final List<class_2680> iiIiIIlIIliIIl = new ArrayList<>();
   private boolean IlliIIlllliIIl;
   private final List<int[]> lllIlIlillIlIl;
   private int IIiiIIllIiiIIl;
   private int iIlIlIlIllIlIl;
   private final IIlIllIilIlIllIi IilIlIllilIlIl;
   private final HashMap<Long, Integer> lIliIIliIliIIl = new HashMap<>();
   private int lIIIlIliIIIlIl;

   public void iIlIlllllill(class_2338 pos) {
      if (pos == null) {
         this.IilIlIllilIlIl.IIIllIIliIIl();
      } else {
         this.IilIlIllilIlIl.iIlIlllllill(pos.method_10263(), pos.method_10264(), pos.method_10260());
      }
   }

   public boolean iliIiiliiiii() {
      return this.IlliIIlllliIIl;
   }

   public boolean IIlllIlliIll(iIilliIlIlilliIl s, int oz, int ox, int oy, int rot, int mirror) {
      this.Iiilliiliiil(s, oz, ox, oy, rot, mirror);
      return this.iiiiIIlIIIIlIl && !this.IiIiIIlliIiIIl.isEmpty();
   }

   public int IiIlliIliiIl() {
      return this.iilIlIlIIiIlIl;
   }

   public Integer IIillIiliIil(long worldCell) {
      return this.lIliIIliIliIIl.get(worldCell);
   }

   public static void liiiIIllIl() {
      synchronized (IliIlIllliIlIl) {
         for (illIlIilIl var2 : IliIlIllliIlIl) {
            var2.IilIlIllilIlIl.iIIIlIlIIl();
            var2.lIiIlIliIiIlIl = -1;
         }
      }
   }

   static int[] IlIillIiilIi(int oz, int sx, int mirror, int oy, int sy, int rot, int sz, int ox) {
      long var12 = 4183004643523263211L;
      long var14 = 3666667561903359082L;
      var12 ^= ((long)(ox == 1 ? -oz : oz) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(ox == 2 ? -mirror : mirror) ^ var12) & -1L >>> 32;
      switch (sz) {
         case 1:
            var14 ^= ((long)(-((int)var12)) << 32 ^ var14) & -1L << 32;
            var14 ^= ((long)((int)(var12 >>> 32)) ^ var14) & -1L >>> 32;
            break;
         case 2:
            var14 ^= ((long)(-((int)(var12 >>> 32))) << 32 ^ var14) & -1L << 32;
            var14 ^= ((long)(-((int)var12)) ^ var14) & -1L >>> 32;
            break;
         case 3:
            var14 ^= ((long)((int)var12) << 32 ^ var14) & -1L << 32;
            var14 ^= ((long)(-((int)(var12 >>> 32))) ^ var14) & -1L >>> 32;
            break;
         default:
            var14 ^= ((long)((int)(var12 >>> 32)) << 32 ^ var14) & -1L << 32;
            var14 ^= ((long)((int)var12) ^ var14) & -1L >>> 32;
      }

      return new int[]{oy + (int)(var14 >>> 32), sy + sx, rot + (int)var14};
   }

   public illIlIilIl() {
      this.IlliIIlllliIIl = false;
      this.iiiiIIlIIIIlIl = false;
      this.lllIlIlillIlIl = new ArrayList<>();
      this.IilIlIllilIlIl = new IIlIllIilIlIllIi();
      this.lIiIlIliIiIlIl = -1;
      synchronized (IliIlIllliIlIl) {
         IliIlIllliIlIl.add(this);
      }
   }

   static class_2680 IiIiliIiiiIi(class_2680 rot, int st, int mirror) {
      if (rot == null) {
         return null;
      } else {
         switch (st) {
            case 1:
               rot = rot.method_26185(class_2415.field_11301);
               break;
            case 2:
               rot = rot.method_26185(class_2415.field_11300);
         }

         switch (mirror) {
            case 1:
               rot = rot.method_26186(class_2470.field_11463);
               break;
            case 2:
               rot = rot.method_26186(class_2470.field_11464);
               break;
            case 3:
               rot = rot.method_26186(class_2470.field_11465);
         }

         return rot;
      }
   }

   private void Illillliilli(Matrix4f cam, class_243 ox, int oz, int oy, int m) {
      float var6 = (float)((double)oz - ox.field_1352);
      float var7 = (float)((double)oy - ox.field_1351);
      float var8 = (float)((double)m - ox.field_1350);
      iIiiIIilIliiIIil.iIIIlIlIIl(cam, var6, var7, var8, var6 + 1.0F, var7 + 1.0F, var8 + 1.0F, Iilililiiili(140), 1.5F);
   }

   public void IilliliilIIi() {
      this.IilIlIllilIlIl.IIIllIIliIIl();
   }

   static int[] IIIilIIiiIIi(int ox, int sz1, int rot, int oy, int mirror, int sx1, int sy0, int sz0, int oz, int sy1, int sx0) {
      int[] var11 = IlIillIiilIi(ox, sz1, rot, sy0, sz0, oz, sy1, sx0);
      int[] var12 = IlIillIiilIi(oy, mirror, sx1, sy0, sz0, oz, sy1, sx0);
      return new int[]{
         Math.min(var11[0], var12[0]),
         Math.min(var11[1], var12[1]),
         Math.min(var11[2], var12[2]),
         Math.max(var11[0], var12[0]),
         Math.max(var11[1], var12[1]),
         Math.max(var11[2], var12[2])
      };
   }

   public int Ililllililil() {
      return this.lIliIIliIliIIl.size();
   }

   public IiIliiiliIliii IlIlllIlilIl() {
      return this.IilIlIllilIlIl.IlIlllIlilIl();
   }

   public void lIiiIiIlilli() {
      this.iiiiIIlIIIIlIl = false;
      this.IilIlIllilIlIl.IIIllIIliIIl();
   }

   public void IIlilIliiIli(class_4587 rot, class_11659 queue, iIilliIlIlilliIl s, int matrices, int oz, int oy, int mirror, int ox, IlIlilillIlili cfg) {
      class_310 var10 = class_310.method_1551();
      if (var10.field_1687 != null && var10.field_1724 != null) {
         this.Iiilliiliiil(s, matrices, oz, oy, mirror, ox);
         Matrix4f var11 = rot.method_23760().method_23761();
         class_243 var12 = var10.method_1561().field_4686.method_71156();
         if (cfg.iiiIlIIIll()) {
            this.Illillliilli(var11, var12, matrices, oz, oy);
         }

         if (cfg.IiiIlliiIl() && this.iiiiIIlIIIIlIl && this.liIIlIliiIIlIl >= this.lIIIlIliIIIlIl) {
            iIiiIIilIliiIIil.iIIIlIlIIl(
               var11,
               (float)((double)this.lIIIlIliIIIlIl - var12.field_1352),
               (float)((double)this.IlIIlIlllIIlIl - var12.field_1351),
               (float)((double)this.ilIIlIlIiIIlIl - var12.field_1350),
               (float)((double)(this.liIIlIliiIIlIl + 1) - var12.field_1352),
               (float)((double)(this.IIlIlIllIlIlIl + 1) - var12.field_1351),
               (float)((double)(this.iIlIlIlIllIlIl + 1) - var12.field_1350),
               Iilililiiili(77),
               1.0F
            );
         }

         if (s != null && cfg.IIlilIliiIli() != llliIIIiilliIIIi.liiiiIliil) {
            if (this.lIiIlIliIiIlIl != this.iilIlIlIIiIlIl) {
               this.IilIlIllilIlIl.liiiIIllIl(this.IiIiIIlliIiIIl, this.iiIiIIlIIliIIl, this.lllIlIlillIlIl);
               this.lIiIlIliIiIlIl = this.iilIlIlIIiIlIl;
            }

            float var13 = var10.method_61966().method_60637(false);
            this.IilIlIllilIlIl.IiIlliIliiIl(cfg, var12, this.IiIiIIlliIiIIl, this.iiIiIIlIIliIIl, Iilililiiili(255), queue, var13);
            iIiiIIilIliiIIil.IiIiliIiiiIi();
         } else {
            iIiiIIilIliiIIil.IiIiliIiiiIi();
         }
      }
   }

   public List<class_2338> Illlllllilll() {
      return this.IiIiIIlliIiIIl;
   }

   public List<class_2680> Iilllilliill() {
      return this.iiIiIIlIIliIIl;
   }

   public int IIIllIIliIIl() {
      return this.IiIiIIlliIiIIl.size();
   }

   private static int Iilililiiili(int a) {
      return a << 24 | IlIIilIlllIIilIl.lliiIlliIl & 16777215;
   }

   public static void IliIlllilIi(class_2338 pos) {
      synchronized (IliIlIllliIlIl) {
         for (illIlIilIl var3 : IliIlIllliIlIl) {
            var3.IilIlIllilIlIl.iIlIlllllill(pos.method_10263(), pos.method_10264(), pos.method_10260());
         }
      }
   }

   private void Iiilliiliiil(iIilliIlIlilliIl oz, int ox, int mirror, int rot, int s, int oy) {
      long var33 = -6017709751184985178L;
      long var35 = -8886637139654732046L;
      long var37 = -5292020617442775887L;
      long var39 = -7669662238189640739L;
      long var41 = -7328569374343690185L;
      long var43 = -3812542748982909999L;
      long var29 = 2590021106164379740L;
      long var31 = -1044714711629237691L;
      if (!this.iiiiIIlIIIIlIl
         || oz != this.illiIIlIiliIIl
         || ox != this.liliIIliiliIIl
         || mirror != this.IIiiIIllIiiIIl
         || rot != this.iIiiIIlIliiIIl
         || s != this.lliiIIliliiIIl
         || oy != this.IiiiIIlliiiIIl) {
         this.illiIIlIiliIIl = oz;
         this.liliIIliiliIIl = ox;
         this.IIiiIIllIiiIIl = mirror;
         this.iIiiIIlIliiIIl = rot;
         this.lliiIIliliiIIl = s;
         this.IiiiIIlliiiIIl = oy;
         this.IiIiIIlliIiIIl.clear();
         this.iiIiIIlIIliIIl.clear();
         this.lIliIIliIliIIl.clear();
         this.IlliIIlllliIIl = false;
         this.lllIlIlillIlIl.clear();
         this.lIIIlIliIIIlIl = this.IlIIlIlllIIlIl = this.ilIIlIlIiIIlIl = Integer.MAX_VALUE;
         this.liIIlIliiIIlIl = this.IIlIlIllIlIlIl = this.iIlIlIlIllIlIl = Integer.MIN_VALUE;
         this.iiiiIIlIIIIlIl = true;
         this.iilIlIlIIiIlIl++;
         this.IilIlIllilIlIl.IIIllIIliIIl();
         if (oz != null) {
            HashSet var7 = new HashSet();

            for (IiliIIIililiIIIi var9 : oz.IIIliiiIll) {
               long var45 = var29 ^ ((long)var9.iIlIlllllill() << 32 ^ var29) & -1L << 32;
               var29 = var45 ^ ((long)var9.IilliliilIIi() ^ var45) & -1L >>> 32;
               var31 ^= ((long)var9.lIiiIiIlilli() << 32 ^ var31) & -1L << 32;
               this.lllIlIlillIlIl
                  .add(
                     IIIilIIiiIIi(
                        (int)(var29 >>> 32),
                        (int)var29,
                        (int)(var31 >>> 32),
                        (int)(var29 >>> 32) + var9.IiIIIlliil - 1,
                        (int)var29 + var9.liIIIlliil - 1,
                        (int)(var31 >>> 32) + var9.iiIIIlliil - 1,
                        ox,
                        mirror,
                        rot,
                        s,
                        oy
                     )
                  );

               for (var31 ^= (0L ^ var31) & -1L >>> 32; (int)var31 < var9.liIIIlliil; var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32) {
                  var33 ^= (0L ^ var33) & -1L << 32;

                  while ((int)(var33 >>> 32) < var9.iiIIIlliil) {
                     for (var33 ^= (0L ^ var33) & -1L >>> 32; (int)var33 < var9.IiIIIlliil; var33 ^= (var33 ^ var33 + (long)1) & -1L >>> 32) {
                        class_2680 var16 = var9.IIIllIIliIIl((int)var33, (int)var31, (int)(var33 >>> 32));
                        if (var16 != null && !var16.method_26215()) {
                           if (var16.method_26204() == class_2246.field_10422) {
                              var16 = class_2246.field_10382.method_9564();
                           } else if (!(var16.method_26204() instanceof class_2404) && iilIlIIlIIiIlIIl.liiiIIllIl(var16) == class_1802.field_8162) {
                              continue;
                           }

                           long var48 = var35 ^ ((long)((int)(var29 >>> 32) + (int)var33) << 32 ^ var35) & -1L << 32;
                           var35 = var48 ^ ((long)((int)var29 + (int)var31) ^ var48) & -1L >>> 32;
                           long var49 = var37 ^ ((long)((int)(var31 >>> 32) + (int)(var33 >>> 32)) << 32 ^ var37) & -1L << 32;
                           var37 = var49 ^ ((long)(oy == 1 ? -((int)(var35 >>> 32)) : (int)(var35 >>> 32)) ^ var49) & -1L >>> 32;
                           var39 ^= ((long)(oy == 2 ? -((int)(var37 >>> 32)) : (int)(var37 >>> 32)) << 32 ^ var39) & -1L << 32;
                           switch (s) {
                              case 1:
                                 var39 ^= ((long)(-((int)(var39 >>> 32))) ^ var39) & -1L >>> 32;
                                 var41 ^= ((long)((int)var37) << 32 ^ var41) & -1L << 32;
                                 break;
                              case 2:
                                 var39 ^= ((long)(-((int)var37)) ^ var39) & -1L >>> 32;
                                 var41 ^= ((long)(-((int)(var39 >>> 32))) << 32 ^ var41) & -1L << 32;
                                 break;
                              case 3:
                                 var39 ^= ((long)((int)(var39 >>> 32)) ^ var39) & -1L >>> 32;
                                 var41 ^= ((long)(-((int)var37)) << 32 ^ var41) & -1L << 32;
                                 break;
                              default:
                                 var39 ^= ((long)((int)var37) ^ var39) & -1L >>> 32;
                                 var41 ^= ((long)((int)(var39 >>> 32)) << 32 ^ var41) & -1L << 32;
                           }

                           var41 ^= ((long)(ox + (int)var39) ^ var41) & -1L >>> 32;
                           var43 ^= ((long)(mirror + (int)var35) << 32 ^ var43) & -1L << 32;
                           var43 ^= ((long)(rot + (int)(var41 >>> 32)) ^ var43) & -1L >>> 32;
                           if (var7.add(class_2338.method_10064((int)var41, (int)(var43 >>> 32), (int)var43))) {
                              this.IiIiIIlliIiIIl.add(new class_2338((int)var41, (int)(var43 >>> 32), (int)var43));
                              class_2680 var27 = IiIiliIiiiIi(var16, oy, s);
                              this.iiIiIIlIIliIIl.add(var27);
                              if (!var9.iIlIIlliil.isEmpty()) {
                                 Integer var28 = var9.liiiIIllIl((int)var33, (int)var31, (int)(var33 >>> 32));
                                 if (var28 != null) {
                                    this.lIliIIliIliIIl.put(class_2338.method_10064((int)var41, (int)(var43 >>> 32), (int)var43), var28);
                                 }
                              }

                              this.lIIIlIliIIIlIl = Math.min(this.lIIIlIliIIIlIl, (int)var41);
                              this.IlIIlIlllIIlIl = Math.min(this.IlIIlIlllIIlIl, (int)(var43 >>> 32));
                              this.ilIIlIlIiIIlIl = Math.min(this.ilIIlIlIiIIlIl, (int)var43);
                              this.liIIlIliiIIlIl = Math.max(this.liIIlIliiIIlIl, (int)var41);
                              this.IIlIlIllIlIlIl = Math.max(this.IIlIlIllIlIlIl, (int)(var43 >>> 32));
                              this.iIlIlIlIllIlIl = Math.max(this.iIlIlIlIllIlIl, (int)var43);
                              if (this.IiIiIIlliIiIIl.size() >= 300000) {
                                 this.IlliIIlllliIIl = true;
                                 return;
                              }
                           }
                        }
                     }

                     var33 += 4294967296L;
                  }
               }
            }
         }
      }
   }
}
