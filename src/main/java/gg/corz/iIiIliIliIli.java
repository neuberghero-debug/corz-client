package gg.corz;

import java.util.Locale;
import java.util.function.LongUnaryOperator;

public record iIiIliIliIli(
   ilIIlliIiIIlli kind,
   long semanticKey,
   long target,
   long stand,
   int transitionKind,
   long support,
   long accessFamily,
   long dependencyFingerprint,
   long[] dependencyCells,
   String reason
) {
   private final long lIliIiIIliIliIiIIl;
   private final int IlliIiIIlllliIiIIl;
   private final String lliiIiIIliliiIiIIl;
   private final long illiIiIIlIiliIiIIl;
   private final long IIiiIiIIllIiiIiIIl;
   private final long IiIiIiIIlliIiIiIIl;
   private final long[] iIiiIiIIlIliiIiIIl;
   private final long iiIiIiIIlIIliIiIIl;
   private final ilIIlliIiIIlli llIiIiIIlilIiIiIIl;
   private final long liliIiIIliiliIiIIl;

   public String iliIiiliiiii() {
      return String.format(
         Locale.ROOT,
         IIIilIIiiIIi<"IIIilIIiiIIi","0djvu/YSJC+gLFfTv1qHbZuxWp98EUqAMQfx5MQcgBacZL0F4U0moQP+yxxtRWGG+I/c/ESpyg==">(),
         this.llIiIiIIlilIiIiIIl,
         this.IiIiIiIIlliIiIiIIl,
         this.iIiiIiIIlIliiIiIIl.length,
         this.lliiIiIIliliiIiIIl
      );
   }

   public long Ililllililil() {
      return this.IIiiIiIIllIiiIiIIl;
   }

   public static long lIiiIiIlilli(long from, long to, int transitionKind) {
      return from * 1099511628211L ^ Long.rotateLeft(to, 31) ^ (long)transitionKind * 2870177450012600261L;
   }

   public long IlIlllIlilIl() {
      return this.IiIiIiIIlliIiIiIIl;
   }

   public ilIIlliIiIIlli IIIllIIliIIl() {
      return this.llIiIiIIlilIiIiIIl;
   }

   public long IIillIiliIil() {
      return this.liliIiIIliiliIiIIl;
   }

   public int Illlllllilll() {
      return this.IlliIiIIlllliIiIIl;
   }

   public long IIlllIlliIll() {
      return this.lIliIiIIliIliIiIIl;
   }

   public String Iiilliiliiil() {
      return this.lliiIiIIliliiIiIIl;
   }

   public boolean iIlIlllllill(LongUnaryOperator stateOf) {
      return this.iIiiIiIIlIliiIiIIl.length == 0 || liiiIIllIl(this.iIiiIiIIlIliiIiIIl, stateOf) == this.IIiiIiIIllIiiIiIIl;
   }

   public long Iilllilliill() {
      return this.illiIiIIlIiliIiIIl;
   }

   public static long IilliliilIIi(long target, long stand) {
      return 2585217853L ^ target * -7046029254386353131L ^ Long.rotateLeft(stand * -4417276706812531889L, 29);
   }

   public long[] IliIlllilIi() {
      return (long[])this.iIiiIiIIlIliiIiIIl.clone();
   }

   public iIiIliIliIli(
      ilIIlliIiIIlli kind,
      long semanticKey,
      long target,
      long stand,
      int transitionKind,
      long support,
      long accessFamily,
      long dependencyFingerprint,
      long[] dependencyCells,
      String reason
   ) {
      dependencyCells = dependencyCells == null ? new long[0] : (long[])dependencyCells.clone();
      reason = reason != null && !reason.isBlank() ? reason : kind.name();
      this.llIiIiIIlilIiIiIIl = kind;
      this.IiIiIiIIlliIiIiIIl = semanticKey;
      this.iiIiIiIIlIIliIiIIl = target;
      this.lIliIiIIliIliIiIIl = stand;
      this.IlliIiIIlllliIiIIl = transitionKind;
      this.illiIiIIlIiliIiIIl = support;
      this.liliIiIIliiliIiIIl = accessFamily;
      this.IIiiIiIIllIiiIiIIl = dependencyFingerprint;
      this.iIiiIiIIlIliiIiIIl = dependencyCells;
      this.lliiIiIIliliiIiIIl = reason;
   }

   public long IiIlliIliiIl() {
      return this.iiIiIiIIlIIliIiIIl;
   }

   public static long liiiIIllIl(long[] stateOf, LongUnaryOperator cells) {
      long var9 = -743237448146434599L;
      long var2 = -3750763034362895579L;
      long[] var4 = stateOf;
      var9 ^= ((long)stateOf.length << 32 ^ var9) & -1L << 32;

      for (long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         long var7 = var4[(int)var12];
         var2 = (var2 ^ var7 * -7046029254386353131L + cells.applyAsLong(var7)) * 1099511628211L;
      }

      return var2;
   }
}
