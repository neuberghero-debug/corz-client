package gg.corz;

import java.util.Locale;

public record ilIllIllIiIllIll(long componentKey, int componentSize, long assetSetHash, int strategy) {
   private final long liiliillll;
   private final int iiiliillll;
   private final int Iiiliillll;
   private final long ililiillll;

   public ilIllIllIiIllIll(long componentKey, int componentSize, long assetSetHash, int strategy) {
      this.ililiillll = componentKey;
      this.Iiiliillll = componentSize;
      this.liiliillll = assetSetHash;
      this.iiiliillll = strategy;
   }

   public long liiiIIllIl() {
      return this.ililiillll;
   }

   public String IliIlllilIi() {
      return String.format(
         Locale.ROOT,
         iliIiiliiiii<"iliIiiliiiii","9dyKL8U7Xu3hbxXJtaDnlb7BPCUarORPmHNVi4XLJ1C6WrTa3ix6OGUAv6W0GEw2LYah9HqYShaiexgJnSp7KqysTD0+rQ==">(),
         this.ililiillll,
         this.Iiiliillll,
         Long.toUnsignedString(this.liiliillll, 16),
         this.iiiliillll
      );
   }

   public int iIlIlllllill() {
      return this.Iiiliillll;
   }

   public long IilliliilIIi() {
      return this.liiliillll;
   }

   public int lIiiIiIlilli() {
      return this.iiiliillll;
   }
}
