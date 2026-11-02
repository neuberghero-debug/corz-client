package gg.corz;

import java.util.List;

public record lililIiiililIi(long referenceUnit, long floorUnit, int pricedListings, List<liiiIiIiiiiiIiIi> candidates) {
   private final List<liiiIiIiiiiiIiIi> iililIliiIIiilIlii;
   private final int IililIliilililIlii;
   private final long lllilIliiillilIlii;
   private final long iIlilIliiIllilIlii;

   public liiiIiIiiiiiIiIi liiiIIllIl() {
      return this.iililIliiIIiilIlii.isEmpty() ? null : this.iililIliiIIiilIlii.get(0);
   }

   public boolean IliIlllilIi() {
      return !this.iililIliiIIiilIlii.isEmpty();
   }

   public long iIlIlllllill() {
      return this.iIlilIliiIllilIlii;
   }

   public int lIiiIiIlilli() {
      return this.IililIliilililIlii;
   }

   public long IilliliilIIi() {
      return this.lllilIliiillilIlii;
   }

   public List<liiiIiIiiiiiIiIi> iliIiiliiiii() {
      return this.iililIliiIIiilIlii;
   }

   public lililIiiililIi(long referenceUnit, long floorUnit, int pricedListings, List<liiiIiIiiiiiIiIi> candidates) {
      this.iIlilIliiIllilIlii = referenceUnit;
      this.lllilIliiillilIlii = floorUnit;
      this.IililIliilililIlii = pricedListings;
      this.iililIliiIIiilIlii = candidates;
   }
}
