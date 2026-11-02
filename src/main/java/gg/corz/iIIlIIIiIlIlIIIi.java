package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongIterator;
import java.util.Arrays;
import net.minecraft.class_1923;
import net.minecraft.class_2818;
import net.minecraft.class_310;
import net.minecraft.class_631;
import net.minecraft.class_638;

public final class iIIlIIIiIlIlIIIi {
   private int[] llIlIIliil;
   private static long iIIlIIliil;
   private int ilIlIIliil;
   private static int lIIlIIliil = Integer.MIN_VALUE;
   private int IIllIIliil;
   private int liIlIIliil;
   private int IiIlIIliil;
   private static final long IIIlIIliil = 2000000L;
   private long lIllIIliil;
   private static final int iiiIIIliil = 192;
   private static final long liiIIIliil = Long.MIN_VALUE;
   private int iiIlIIliil;
   private final Long2LongOpenHashMap IlIlIIliil = new Long2LongOpenHashMap();
   private long iIllIIliil;

   public static long IliIlllilIi(int baseMicros) {
      long var4 = 4116787530650034902L;
      long var1 = (long)baseMicros * 1000L;
      var4 ^= ((long)class_310.method_1551().method_47599() << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) > 0 && (int)(var4 >>> 32) < 25) {
         return var1 / 4L;
      } else if ((int)(var4 >>> 32) > 0 && (int)(var4 >>> 32) < 45) {
         return var1 / 2L;
      } else {
         return (int)(var4 >>> 32) >= 100 ? var1 + var1 / 2L : var1;
      }
   }

   private void Illlllllilll(int radius) {
      long var9 = 912920843201079311L;
      long var11 = 5914773331791807222L;
      var9 ^= ((long)(radius * 2 + 1) << 32 ^ var9) & -1L << 32;
      long[] var3 = new long[(int)(var9 >>> 32) * (int)(var9 >>> 32)];
      var9 ^= (0L ^ var9) & -1L >>> 32;
      var11 ^= ((long)(-radius) << 32 ^ var11) & -1L << 32;

      while ((int)(var11 >>> 32) <= radius) {
         for (var11 ^= ((long)(-radius) ^ var11) & -1L >>> 32; (int)var11 <= radius; var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            long var7 = (long)(Math.abs((int)(var11 >>> 32)) + Math.abs((int)var11));
            int var10001 = (int)var9;
            var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32;
            var3[var10001] = var7 << 32 | (long)((int)(var11 >>> 32) + radius) << 16 | (long)((int)var11 + radius);
         }

         var11 += 4294967296L;
      }

      Arrays.sort(var3);
      this.llIlIIliil = new int[(int)var9 << 1];

      for (long var17 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var17 >>> 32) < (int)var9; var17 += 4294967296L) {
         this.llIlIIliil[(int)(var17 >>> 32) << 1] = (int)(var3[(int)(var17 >>> 32)] >> 16 & 65535L) - radius;
         this.llIlIIliil[((int)(var17 >>> 32) << 1) + 1] = (int)(var3[(int)(var17 >>> 32)] & 65535L) - radius;
      }

      this.ilIlIIliil = radius;
      this.IiIlIIliil = 0;
      this.liIlIIliil = 0;
   }

   public void IiIlliIliiIl(int chunkX, int maxDistance, int chunkZ) {
      LongIterator var4 = this.IlIlIIliil.keySet().iterator();

      while (var4.hasNext()) {
         long var5 = var4.nextLong();
         if (Math.abs(class_1923.method_8325(var5) - chunkX) > chunkZ || Math.abs(class_1923.method_8332(var5) - maxDistance) > chunkZ) {
            var4.remove();
         }
      }
   }

   public int IIlllIlliIll(class_638 rescanMs, int budgetNanos, int radius, int world, long chunkX, long chunkZ, IIiIIIillIiIIIil scanner) {
      long var33 = -8678552488321736986L;
      long var35 = 3776252762957317608L;
      long var37 = -413327483488797181L;
      long var39 = 473173565662456005L;
      long var41 = -6905855114950184845L;
      if (rescanMs != null && world >= 0) {
         this.iIllIIliil = chunkX;
         if (world != this.ilIlIIliil) {
            this.Illlllllilll(world);
         }

         if (budgetNanos != this.iiIlIIliil || radius != this.IIllIIliil) {
            this.iiIlIIliil = budgetNanos;
            this.IIllIIliil = radius;
            this.IiIlIIliil = 0;
         }

         if (this.lIllIIliil >= chunkZ) {
            this.lIllIIliil -= chunkZ;
            return 0;
         } else {
            long var10 = chunkZ - this.lIllIIliil;
            this.lIllIIliil = 0L;
            var33 ^= ((long)class_310.method_1551().field_1705.method_1738() << 32 ^ var33) & -1L << 32;
            if ((int)(var33 >>> 32) != lIIlIIliil) {
               lIIlIIliil = (int)(var33 >>> 32);
               iIIlIIliil = 0L;
            }

            long var13 = 2000000L - iIIlIIliil;
            if (var13 <= 0L) {
               return 0;
            } else {
               var33 ^= ((long)(var13 < var10 ? 1 : 0) ^ var33) & -1L >>> 32;
               if ((int)var33 != 0) {
                  var10 = var13;
               }

               class_631 var16 = rescanMs.method_2935();
               long var17 = System.currentTimeMillis();
               long var19 = System.nanoTime();
               var35 ^= ((long)(this.llIlIIliil.length >> 1) << 32 ^ var35) & -1L << 32;
               var35 ^= (0L ^ var35) & -1L >>> 32;
               var37 ^= (0L ^ var37) & -1L << 32;
               var37 ^= (0L ^ var37) & -1L >>> 32;

               while ((int)var37 < 192 && (int)var37 < (int)(var35 >>> 32)) {
                  if (this.IiIlIIliil >= (int)(var35 >>> 32)) {
                     this.IiIlIIliil = 0;
                  }

                  long var51 = var39 ^ ((long)(this.IiIlIIliil++ << 1) << 32 ^ var39) & -1L << 32;
                  var37 ^= (var37 ^ var37 + (long)1) & -1L >>> 32;
                  var39 = var51 ^ ((long)(budgetNanos + this.llIlIIliil[(int)(var51 >>> 32)]) ^ var51) & -1L >>> 32;
                  var41 ^= ((long)(radius + this.llIlIIliil[(int)(var39 >>> 32) + 1]) << 32 ^ var41) & -1L << 32;
                  long var28 = class_1923.method_8331((int)var39, (int)(var41 >>> 32));
                  if (this.IlIlIIliil.get(var28) == Long.MIN_VALUE) {
                     class_2818 var30 = var16.method_21730((int)var39, (int)(var41 >>> 32));
                     if (var30 != null) {
                        this.IlIlIIliil.put(var28, var17);
                        scanner.scan(var30, var28);
                        var35 ^= (var35 ^ var35 + (long)1) & -1L >>> 32;
                        if (System.nanoTime() - var19 >= var10) {
                           var37 ^= (4294967296L ^ var37) & -1L << 32;
                           break;
                        }
                     }
                  }
               }

               if ((int)var35 == 0 && chunkX > 0L) {
                  var37 ^= (0L ^ var37) & -1L >>> 32;

                  while ((int)var37 < 192 && (int)var37 < (int)(var35 >>> 32)) {
                     if (this.liIlIIliil >= (int)(var35 >>> 32)) {
                        this.liIlIIliil = 0;
                     }

                     long var52 = var39 ^ ((long)(this.liIlIIliil++ << 1) << 32 ^ var39) & -1L << 32;
                     var37 ^= (var37 ^ var37 + (long)1) & -1L >>> 32;
                     var39 = var52 ^ ((long)(budgetNanos + this.llIlIIliil[(int)(var52 >>> 32)]) ^ var52) & -1L >>> 32;
                     var41 ^= ((long)(radius + this.llIlIIliil[(int)(var39 >>> 32) + 1]) << 32 ^ var41) & -1L << 32;
                     long var43 = class_1923.method_8331((int)var39, (int)(var41 >>> 32));
                     long var44 = this.IlIlIIliil.get(var43);
                     if (var44 == Long.MIN_VALUE || var17 - var44 >= chunkX) {
                        class_2818 var32 = var16.method_21730((int)var39, (int)(var41 >>> 32));
                        if (var32 != null) {
                           this.IlIlIIliil.put(var43, var17);
                           scanner.scan(var32, var43);
                           var35 ^= (var35 ^ var35 + (long)1) & -1L >>> 32;
                           if (System.nanoTime() - var19 >= var10) {
                              var37 ^= (4294967296L ^ var37) & -1L << 32;
                              break;
                           }
                        }
                     }
                  }
               }

               long var25 = System.nanoTime() - var19;
               iIIlIIliil += var25;
               if ((int)(var37 >>> 32) != 0 && (int)var33 == 0 && var25 > var10) {
                  this.lIllIIliil = var25 - var10;
               }

               return (int)var35;
            }
         }
      } else {
         return 0;
      }
   }

   public int IlIlllIlilIl() {
      return this.IlIlIIliil.size();
   }

   public boolean IIIllIIliIIl(long key) {
      return this.IlIlIIliil.containsKey(key);
   }

   public void lIiiIiIlilli(long key) {
      this.IlIlIIliil.put(key, System.currentTimeMillis());
   }

   public void iIlIlllllill(long key) {
      if (this.IlIlIIliil.remove(key) != Long.MIN_VALUE) {
         this.IiIlIIliil = 0;
      }
   }

   public iIIlIIIiIlIlIIIi() {
      this.llIlIIliil = new int[0];
      this.ilIlIIliil = -1;
      this.iiIlIIliil = Integer.MIN_VALUE;
      this.IIllIIliil = Integer.MIN_VALUE;
      this.IlIlIIliil.defaultReturnValue(Long.MIN_VALUE);
   }

   public void iliIiiliiiii(int chunkZ, int graceMs, long chunkX) {
      long var5 = class_1923.method_8331(chunkZ, graceMs);
      long var7 = this.IlIlIIliil.get(var5);
      if (var7 != Long.MIN_VALUE) {
         long var9 = System.currentTimeMillis() + chunkX - this.iIllIIliil;
         if (var9 < var7) {
            this.IlIlIIliil.put(var5, var9);
         }
      }
   }

   public void liiiIIllIl() {
      this.IlIlIIliil.clear();
      this.IiIlIIliil = 0;
      this.liIlIIliil = 0;
      this.lIllIIliil = 0L;
   }

   public void IilliliilIIi(int chunkX, int chunkZ) {
      this.iIlIlllllill(class_1923.method_8331(chunkX, chunkZ));
   }
}
