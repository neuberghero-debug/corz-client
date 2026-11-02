package gg.corz;

import java.util.ArrayList;

public record IiliIIllliliIIll(long target, int disabledMask, String schematicBlockState) {
   private final long lillIlllll;
   public static final int iIilIlllll = 511;
   private final String IIilIlllll;
   public static final int lIilIlllll = 9;
   private final int iillIlllll;

   public static int IliIlllilIi(int[] disabledSlots) {
      long var6 = 6953503102544094929L;
      long var8 = 2531543273512028244L;
      var6 ^= (0L ^ var6) & -1L << 32;
      if (disabledSlots != null) {
         int[] var2 = disabledSlots;
         var6 ^= ((long)disabledSlots.length ^ var6) & -1L >>> 32;
         var8 ^= (0L ^ var8) & -1L << 32;

         while ((int)(var8 >>> 32) < (int)var6) {
            var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
            if ((int)var8 >= 0 && (int)var8 < 9) {
               var6 ^= ((long)((int)(var6 >>> 32) | 1 << (int)var8) << 32 ^ var6) & -1L << 32;
            }

            var8 += 4294967296L;
         }
      }

      return (int)(var6 >>> 32);
   }

   public static String iliIiiliiiii(int mask) {
      long var3 = -6309950885718897733L;
      StringBuilder var1 = new StringBuilder();

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 9; var5 += 4294967296L) {
         if ((int)(var5 >>> 32) > 0 && (int)(var5 >>> 32) % 3 == 0) {
            var1.append('/');
         }

         var1.append((char)(IilliliilIIi(mask, (int)(var5 >>> 32)) ? '#' : '.'));
      }

      return var1.toString();
   }

   public String IIIllIIliIIl() {
      return Illlllllilll<"Illlllllilll","YgP5B5/1uHok3zYfP5QViJ3tN0gwqriKGzYQqPXDwuFJ4M0=">()
         + llIiIiililIiIiil.IlIlllIlilIl(this.lillIlllll)
         + Illlllllilll<"Illlllllilll","/fsYkW7pyzMj+yy1DG0fKmKr64sZ0IKBd740hTAQHvuTWRRlTZeH2Ns=">()
         + iliIiiliiiii(this.iillIlllll)
         + Illlllllilll<"Illlllllilll","fDr8THcNwyj0L8wgKEimgWS+1JnSTh1lwn/5zLspKNtHtlo=">()
         + this.IIilIlllll;
   }

   public static int liiiIIllIl(boolean[] disabled) {
      long var3 = -282766659593793247L;
      var3 ^= (0L ^ var3) & -1L << 32;
      if (disabled != null) {
         for (var3 ^= (0L ^ var3) & -1L >>> 32; (int)var3 < Math.min(9, disabled.length); var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32) {
            if (disabled[(int)var3]) {
               var3 ^= ((long)((int)(var3 >>> 32) | 1 << (int)var3) << 32 ^ var3) & -1L << 32;
            }
         }
      }

      return (int)(var3 >>> 32);
   }

   public long IlIlllIlilIl() {
      return this.lillIlllll;
   }

   public static int[] lIiiIiIlilli(int current, int desired) {
      return iIlIlllllill((current ^ desired) & 511);
   }

   public IiliIIllliliIIll(long target, int disabledMask, String schematicBlockState) {
      this.lillIlllll = target;
      this.iillIlllll = disabledMask;
      this.IIilIlllll = schematicBlockState;
   }

   public static int[] iIlIlllllill(int mask) {
      long var3 = -3837934522338355088L;
      ArrayList var1 = new ArrayList();

      for (long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 9; var5 += 4294967296L) {
         if ((mask & 1 << (int)(var5 >>> 32)) != 0) {
            var1.add((int)(var5 >>> 32));
         }
      }

      return var1.stream().mapToInt(Integer::intValue).toArray();
   }

   public int IiIlliIliiIl() {
      return this.iillIlllll;
   }

   public String IIlllIlliIll() {
      return this.IIilIlllll;
   }

   public static boolean IilliliilIIi(int mask, int slot) {
      return (mask & 1 << slot) != 0;
   }
}
