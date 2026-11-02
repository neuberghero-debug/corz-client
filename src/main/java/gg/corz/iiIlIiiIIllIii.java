package gg.corz;

import java.util.Collection;
import java.util.Set;

public record iiIlIiiIIllIii(int minUnlocks, Set<Long> scope, int tempBudget, String why) {
   private final int liIIiilIIl;
   private final Set<Long> iiIIiilIIl;
   private final String lIlIiilIIl;
   private final int IIlIiilIIl;

   public int IlIlllIlilIl() {
      return this.IIlIiilIIl;
   }

   public Set<Long> IIIllIIliIIl() {
      return this.iiIIiilIIl;
   }

   public int iliIiiliiiii() {
      return this.liIIiilIIl;
   }

   public static iiIlIiiIIllIii liiiIIllIl(Set<Long> tempBudget, int blocked) {
      long var3 = -5563370856641991169L;
      var3 ^= ((long)(tempBudget == null ? 0 : tempBudget.size()) << 32 ^ var3) & -1L << 32;
      return new iiIlIiiIIllIii(
         Math.max(1, Math.min(3, (int)(var3 >>> 32))),
         tempBudget,
         blocked,
         IIlllIlliIll<"IIlllIlliIll","nqj7yGq4mQZ7HIyP5wEvN9K92IOMEoUgsJv5Q/2s1ko/SikHX9nWQZFLqehz">()
      );
   }

   public boolean lIiiIiIlilli() {
      return this.liIIiilIIl >= 3 || this.iIlIlllllill();
   }

   public boolean iIlIlllllill() {
      return !this.iiIIiilIIl.isEmpty();
   }

   public boolean IilliliilIIi(Collection<Long> cluster) {
      if (!this.iIlIlllllill()) {
         return true;
      } else {
         for (long var3 : cluster) {
            if (this.iiIIiilIIl.contains(var3)) {
               return true;
            }
         }

         return false;
      }
   }

   public String IiIlliIliiIl() {
      return this.lIlIiilIIl;
   }

   public static iiIlIiiIIllIii IliIlllilIi() {
      return new iiIlIiiIIllIii(3, Set.of(), 12, IIlllIlliIll<"IIlllIlliIll","kLAmjn8GEu3ymEu3Od6Z+ZNaDijAaokGhhUJuXjRO9oZSnVspfo=">());
   }

   public iiIlIiiIIllIii(int minUnlocks, Set<Long> scope, int tempBudget, String why) {
      scope = scope == null ? Set.of() : Set.copyOf(scope);
      minUnlocks = Math.max(1, minUnlocks);
      this.liIIiilIIl = minUnlocks;
      this.iiIIiilIIl = scope;
      this.IIlIiilIIl = tempBudget;
      this.lIlIiilIIl = why;
   }
}
