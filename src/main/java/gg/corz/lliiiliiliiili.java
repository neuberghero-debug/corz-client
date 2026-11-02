package gg.corz;

import java.util.LinkedHashMap;
import java.util.Map;

public final class lliiiliiliiili {
   public final Map<Iiiiilllliiiilll, Integer> IillIllIIl = new LinkedHashMap<>();
   public int llllIllIIl;
   public int illlIllIIl;
   public int IlllIllIIl;

   public void IliIlllilIi() {
      this.IlllIllIIl = this.llllIllIIl = this.illlIllIIl = 0;
      this.IillIllIIl.clear();
   }

   public void liiiIIllIl(iiIillIlIIlillIl d) {
      this.IlllIllIIl++;
      if (d.IliIlllilIi()) {
         this.illlIllIIl++;
      } else {
         this.IillIllIIl.merge(d.liiiIIllIl(), 1, Integer::sum);
      }
   }

   public String iIlIlllllill() {
      return IilliliilIIi<"IilliliilIIi","I4O2FVFcD0Jcis5acqVKzRdrkQ0Jty2vzn7nZptXsh4nlO4=">()
         + this.IlllIllIIl
         + IilliliilIIi<"IilliliilIIi","h5H64UXgwg5udVszx+bFq8CuUs8SfTZhEvrX20TjNOPFNt8npESx4g==">()
         + this.llllIllIIl
         + IilliliilIIi<"IilliliilIIi","fvoSmmKljey9xR06o85aH4puYmW5ncGhqZqX497er1fTn+xCaUCvXVk=">()
         + this.illlIllIIl
         + IilliliilIIi<"IilliliilIIi","dThn4GEL8ElAN5GOFxpXwENJXXOSRZwAcp/ilbqzmTeVGYroO+vQAZcl5Kk=">()
         + this.IillIllIIl;
   }
}
