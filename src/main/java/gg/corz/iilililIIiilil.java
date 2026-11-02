package gg.corz;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;

public record iilililIIiilil(long target, long[] workspaceCells, long[] assetCells) {
   private final long lIlIIiIliiIlIIiIli;
   private final long[] IllIIiIlilllIIiIli;
   private final long[] illIIiIliIilIIiIli;

   public iilililIIiilil(long target, long[] workspaceCells, long[] assetCells) {
      workspaceCells = workspaceCells == null ? new long[0] : (long[])workspaceCells.clone();
      assetCells = assetCells == null ? new long[0] : (long[])assetCells.clone();
      this.lIlIIiIliiIlIIiIli = target;
      this.IllIIiIlilllIIiIli = workspaceCells;
      this.illIIiIliIilIIiIli = assetCells;
   }

   private static long IIIllIIliIIl(long packed) {
      return llIiIiililIiIiil.IIIllIIliIIl(
         llIiIiililIiIiil.IiIlliIliiIl(packed), llIiIiililIiIiil.IIlllIlliIll(packed) - 1, llIiIiililIiIiil.Illlllllilll(packed)
      );
   }

   public long IiIlliIliiIl() {
      return this.lIlIIiIliiIlIIiIli;
   }

   private static long iliIiiliiiii(long packed) {
      return llIiIiililIiIiil.IIIllIIliIIl(
         llIiIiililIiIiil.IiIlliIliiIl(packed), llIiIiililIiIiil.IIlllIlliIll(packed) + 1, llIiIiililIiIiil.Illlllllilll(packed)
      );
   }

   public long[] IIlllIlliIll() {
      return this.IllIIiIlilllIIiIli;
   }

   public static iilililIIiilil IliIlllilIi(long target, Collection<Long> candidateStands, LongPredicate ownedTemp) {
      LinkedHashSet var4 = new LinkedHashSet();
      var4.add(target);
      if (candidateStands != null) {
         for (long var6 : candidateStands) {
            var4.add(var6);
            var4.add(iliIiiliiiii(var6));
         }
      }

      LinkedHashSet var9 = new LinkedHashSet();

      for (long var7 : var4) {
         var9.add(IIIllIIliIIl(var7));
         if (ownedTemp != null && ownedTemp.test(var7)) {
            var9.add(var7);
         }
      }

      return new iilililIIiilil(target, IlIlllIlilIl(var4), IlIlllIlilIl(var9));
   }

   private static long[] IlIlllIlilIl(Collection<Long> in) {
      long var6 = 7165277901580462864L;
      long[] var1 = new long[in.size()];
      var6 ^= (0L ^ var6) & -1L << 32;

      for (long var4 : in) {
         int var10001 = (int)(var6 >>> 32);
         var6 += 4294967296L;
         var1[var10001] = var4;
      }

      return var1;
   }

   public boolean liiiIIllIl(long cell) {
      long var8 = -6758867475712166808L;
      long[] var3 = this.IllIIiIlilllIIiIli;
      var8 ^= ((long)var3.length << 32 ^ var8) & -1L << 32;

      for (long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         long var6 = var3[(int)var11];
         if (var6 == cell) {
            return true;
         }
      }

      return false;
   }

   public long[] Illlllllilll() {
      return this.illIIiIliIilIIiIli;
   }

   public int iIlIlllllill() {
      return this.IllIIiIlilllIIiIli.length;
   }

   public String lIiiIiIlilli() {
      return String.format(
         Locale.ROOT,
         Iilllilliill<"Iilllilliill","+nQVWfFUEFC1c8fU5TWw84+3vx9J8TJbEgCwbx7ETTYIzqljuJpaw+dgQ1HSPRXgj0HLj/6JOWQ=">(),
         this.IllIIiIlilllIIiIli.length,
         this.illIIiIliIilIIiIli.length
      );
   }

   public long IilliliilIIi(LongUnaryOperator stateOf) {
      return iIiIliIliIli.liiiIIllIl(this.illIIiIliIilIIiIli, stateOf);
   }
}
