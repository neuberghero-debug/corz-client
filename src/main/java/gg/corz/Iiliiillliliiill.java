package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.minecraft.class_1923;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_638;

final class Iiliiillliliiill {
   private static final int lllliiiill = 1400;
   static final int lIlliiiill = 32;
   final lIlIIIliiIlIIIli lilliiiill;
   private class_638 iIiliiiill;
   static final int IIlliiiill = 64;
   private static final long illliiiill = -1L;
   final Long2ObjectOpenHashMap<lIilIliiIilIli> Iilliiiill = new Long2ObjectOpenHashMap();
   private final iIIlIIIiIlIlIIIi iilliiiill = new iIIlIIIiIlIlIIIi();
   private int Ililiiiill;
   private int lliliiiill;
   static final int iiIliiiill = 2;
   private final llIIiIlilIIiIl IIiliiiill = new llIIiIlilIIiIl();
   private static final long Illliiiill = 600000L;
   private final LongArrayList lIiliiiill = new LongArrayList();
   private static final int iIlliiiill = 6;

   private boolean lIiiIiIlilli(class_2818 chunk, long key) {
      long var16 = -4637478121419934677L;
      long var18 = -8305759032876950050L;
      long var20 = 2762370212964811683L;
      long var22 = 7896444638399804901L;
      if (this.iIiliiiill == null) {
         return false;
      } else {
         lIilIliiIilIli var4 = (lIilIliiIilIli)this.Iilliiiill.get(key);
         var16 ^= ((long)(var4 == null ? 1 : 0) << 32 ^ var16) & -1L << 32;
         if ((int)(var16 >>> 32) != 0) {
            var4 = new lIilIliiIilIli(key);
            this.Iilliiiill.put(key, var4);
         }

         var16 ^= ((long)chunk.method_12006().length ^ var16) & -1L >>> 32;
         if (var4.liIllIIIIl.length != (int)var16) {
            var4.liIllIIIIl = new lilIIIliilIIIl[(int)var16];
            var4.iiIllIIIIl = -1L;
         }

         long var7 = var4.iiIllIIIIl == 0L ? -1L : var4.iiIllIIIIl;
         var4.iiIllIIIIl = 0L;
         var18 ^= ((long)((var4.ilIllIIIIl >> 2) * 64) << 32 ^ var18) & -1L << 32;
         var18 ^= ((long)((var4.IiIllIIIIl >> 2) * 64) ^ var18) & -1L >>> 32;
         var20 ^= (0L ^ var20) & -1L << 32;
         var20 ^= (1L ^ var20) & -1L >>> 32;

         try {
            for (long var31 = var22 ^ (0L ^ var22) & -1L << 32; (int)(var31 >>> 32) < (int)var16; var31 += 4294967296L) {
               if ((int)var16 > 64 || var7 == -1L || (var7 & 1L << (int)(var31 >>> 32)) != 0L) {
                  lilIIIliilIIIl var14 = var4.liIllIIIIl[(int)(var31 >>> 32)];
                  lilIIIliilIIIl var15 = this.IIiliiiill.IliIlllilIi(this.iIiliiiill, chunk, (int)(var31 >>> 32), (int)(var18 >>> 32), (int)var18);
                  var4.liIllIIIIl[(int)(var31 >>> 32)] = var15;
                  if (var14 != null || var15 != null) {
                     var20 ^= (4294967296L ^ var20) & -1L << 32;
                  }
               }
            }
         } catch (Throwable var24) {
            var20 ^= (0L ^ var20) & -1L >>> 32;
         }

         if ((int)(var20 >>> 32) != 0) {
            this.lilliiiill.IliIlllilIi(IliIlllilIi(var4.ilIllIIIIl, var4.IiIllIIIIl));
         }

         return (boolean)((int)var20);
      }
   }

   void Illlllllilll() {
      this.IIlllIlliIll();
      this.IIiliiiill.liiiIIllIl();
   }

   void IIlllIlliIll() {
      if (!this.Iilliiiill.isEmpty()) {
         this.Iilliiiill.clear();
      }

      this.iilliiiill.liiiIIllIl();
      this.lilliiiill.IIIllIIliIIl();
      this.iIiliiiill = null;
   }

   int iIlIlllllill() {
      return this.Ililiiiill;
   }

   private void IiIlliIliiIl(int cx, int cz) {
      long var9 = 2154939206130057340L;
      var9 ^= ((long)(this.Ililiiiill + 2) << 32 ^ var9) & -1L << 32;
      this.lIiliiiill.clear();
      ObjectIterator var4 = this.Iilliiiill.long2ObjectEntrySet().fastIterator();

      while (var4.hasNext()) {
         lIilIliiIilIli var5 = (lIilIliiIilIli)((Entry)var4.next()).getValue();
         if (Math.abs(var5.ilIllIIIIl - cx) > (int)(var9 >>> 32) || Math.abs(var5.IiIllIIIIl - cz) > (int)(var9 >>> 32)) {
            this.lIiliiiill.add(var5.llIllIIIIl);
         }
      }

      for (var9 ^= (0L ^ var9) & -1L >>> 32; (int)var9 < this.lIiliiiill.size(); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         long var6 = this.lIiliiiill.getLong((int)var9);
         lIilIliiIilIli var8 = (lIilIliiIilIli)this.Iilliiiill.remove(var6);
         if (var8 != null) {
            this.lilliiiill.IliIlllilIi(IliIlllilIi(var8.ilIllIIIIl, var8.IiIllIIIIl));
         }
      }

      this.iilliiiill.IiIlliIliiIl(cx, cz, (int)(var9 >>> 32));
   }

   void IilliliilIIi(class_310 mc, int maxColumns) {
      long var12 = 8124049644466630970L;
      long var14 = -4659845953224412860L;
      if (this.iIiliiiill != null && mc.field_1724 != null && mc.field_1687 == this.iIiliiiill) {
         class_1923 var3 = mc.field_1724.method_31476();
         var12 ^= (0L ^ var12) & -1L << 32;

         for (long var17 = var12 ^ (0L ^ var12) & -1L >>> 32;
            (int)var17 <= 6 && (int)(var17 >>> 32) < maxColumns;
            var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32
         ) {
            var14 ^= ((long)(-((int)var17)) << 32 ^ var14) & -1L << 32;

            while ((int)(var14 >>> 32) <= (int)var17 && (int)(var17 >>> 32) < maxColumns) {
               for (var14 ^= ((long)(-((int)var17)) ^ var14) & -1L >>> 32;
                  (int)var14 <= (int)var17 && (int)(var17 >>> 32) < maxColumns;
                  var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32
               ) {
                  if (Math.max(Math.abs((int)(var14 >>> 32)), Math.abs((int)var14)) == (int)var17) {
                     long var8 = class_1923.method_8331(var3.field_9181 + (int)(var14 >>> 32), var3.field_9180 + (int)var14);
                     lIilIliiIilIli var10 = (lIilIliiIilIli)this.Iilliiiill.get(var8);
                     if (var10 == null || var10.iiIllIIIIl != 0L) {
                        class_2818 var11 = this.iIiliiiill.method_2935().method_21730(var3.field_9181 + (int)(var14 >>> 32), var3.field_9180 + (int)var14);
                        if (var11 != null) {
                           if (this.lIiiIiIlilli(var11, var8) && var10 == null) {
                              this.iilliiiill.lIiiIiIlilli(var8);
                           }

                           var17 += 4294967296L;
                        }
                     }
                  }
               }

               var14 += 4294967296L;
            }
         }
      }
   }

   void IlIlllIlilIl(int cz, int cx) {
      long var3 = class_1923.method_8331(cz, cx);
      if (this.Iilliiiill.remove(var3) != null) {
         this.lilliiiill.IliIlllilIi(IliIlllilIi(cz, cx));
      }

      this.iilliiiill.iIlIlllllill(var3);
   }

   void IIIllIIliIIl(int cz, int cx) {
      long var8 = -107862038186380873L;
      if (this.iIiliiiill != null) {
         var8 ^= (-4294967296L ^ var8) & -1L << 32;

         while ((int)(var8 >>> 32) <= 1) {
            for (var8 ^= ~var8 & -1L >>> 32; (int)var8 <= 1; var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
               if (((int)(var8 >>> 32) | (int)var8) != 0) {
                  long var5 = class_1923.method_8331(cz + (int)(var8 >>> 32), cx + (int)var8);
                  lIilIliiIilIli var7 = (lIilIliiIilIli)this.Iilliiiill.get(var5);
                  if (var7 != null) {
                     var7.iiIllIIIIl = -1L;
                     this.iilliiiill.iIlIlllllill(var5);
                  }
               }
            }

            var8 += 4294967296L;
         }
      }
   }

   Iiliiillliliiill(lIlIIIliiIlIIIli regions) {
      this.Ililiiiill = 8;
      this.lilliiiill = regions;
   }

   void iliIiiliiiii(int sx, int sz, int sy) {
      long var8 = -2008022842584507420L;
      if (this.iIiliiiill != null) {
         long var4 = class_1923.method_8331(sx, sy);
         lIilIliiIilIli var6 = (lIilIliiIilIli)this.Iilliiiill.get(var4);
         if (var6 != null) {
            var8 ^= ((long)(sz - this.iIiliiiill.method_32891()) << 32 ^ var8) & -1L << 32;
            if ((int)(var8 >>> 32) >= 0 && (int)(var8 >>> 32) < 64 && var6.liIllIIIIl.length <= 64) {
               var6.iiIllIIIIl |= 1L << (int)(var8 >>> 32);
            } else {
               var6.iiIllIIIIl = -1L;
            }

            this.iilliiiill.iIlIlllllill(var4);
         }
      }
   }

   static long IliIlllilIi(int cx, int cz) {
      return class_1923.method_8331(cx >> 2, cz >> 2);
   }

   void liiiIIllIl(class_310 mc) {
      class_638 var2 = mc.field_1687;
      if (var2 != null && mc.field_1724 != null) {
         if (var2 != this.iIiliiiill) {
            this.IIlllIlliIll();
            this.iIiliiiill = var2;
         }

         this.Ililiiiill = Math.max(2, Math.min(mc.field_1690.method_38521() + 1, 32));
         class_1923 var3 = mc.field_1724.method_31476();
         this.iilliiiill.IIlllIlliIll(var2, var3.field_9181, var3.field_9180, this.Ililiiiill, 600000L, iIIlIIIiIlIlIIIi.IliIlllilIi(1400), this::lIiiIiIlilli);
         if (++this.lliliiiill >= 40) {
            this.lliliiiill = 0;
            this.IiIlliIliiIl(var3.field_9181, var3.field_9180);
         }
      } else {
         this.IIlllIlliIll();
      }
   }
}
