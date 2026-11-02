package gg.corz;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class IiillIIlliillIIl {
   private final List<IIIlilIllIIlilIl> iiIiiillIl;
   private final double iIliiillIl;
   private final IllIllillllIllil liIiiillIl;
   private final List<Long> IIliiillIl;
   private final int lIliiillIl;

   public boolean Illlllllilll() {
      return this.iiIiiillIl.isEmpty();
   }

   public IiillIIlliillIIl(IllIllillllIllil entryNodes, List<IIIlilIllIIlilIl> expectedSeconds, List<Long> steps, int kind, double tempBlocks) {
      this.liIiiillIl = entryNodes;
      this.iiIiiillIl = List.copyOf(expectedSeconds);
      this.IIliiillIl = List.copyOf(steps);
      this.lIliiillIl = kind;
      this.iIliiillIl = tempBlocks;
   }

   public List<Long> IIlllIlliIll() {
      ArrayList var1 = new ArrayList(this.iiIiiillIl.size());

      for (IIIlilIllIIlilIl var3 : this.iiIiiillIl) {
         var1.add(var3.iIlIlllllill());
      }

      return var1;
   }

   @Override
   public String toString() {
      return this.liIiiillIl
         + Iilllilliill<"Iilllilliill","rRjDqEr73Tn+K4c9TSrA6hS1TQlGfTefbCVQoe661yKSQDYvil0=">()
         + this.lIiiIiIlilli()
         + Iilllilliill<"Iilllilliill","vQKlE/wFLI8wP8+PF9uWzETqjnbQG9JSlx2rf2/9Ava6CNNZ">()
         + this.IiIlliIliiIl().size()
         + Iilllilliill<"Iilllilliill","CkGqpaHt+u65CbmI7yVqXU+Yd3UaoixWfUWfTDNqb1/pRr2ziGgWeg==">()
         + this.lIliiillIl
         + Iilllilliill<"Iilllilliill","KuMwvPYNb46F58rgVvMC/SiHFCQjl/z6AnnVFmlO2KIIAQ==">()
         + this.IIliiillIl.size()
         + Iilllilliill<"Iilllilliill","EmKJKMRAAoo2+n6VVOeKwrVArRAq7+4E5rcxzkeVECLnww==">()
         + String.format(Iilllilliill<"Iilllilliill","tYLVIW8+J9mlvSNWDyIjBkUURlvNmI2M3I42Y+bCmNU=">(), this.iIliiillIl)
         + Iilllilliill<"Iilllilliill","OuwYzbahVZCo+Q/irDVMn9fV1QGxS6l7WfdwP+sXqcpI3w==">()
         + String.format(Iilllilliill<"Iilllilliill","9YCUd3bNWDyy6Jb7Esc26yi+HIyaOJefM3+VQ53WOSo=">(), this.IlIlllIlilIl())
         + Iilllilliill<"Iilllilliill","DAJrueind/bWIsznBptKYNzpAf7OcxSmm9bSe2c=">();
   }

   public double IIIllIIliIIl() {
      return this.iIliiillIl;
   }

   public Set<Long> IiIlliIliiIl() {
      LinkedHashSet var1 = new LinkedHashSet();

      for (IIIlilIllIIlilIl var3 : this.iiIiiillIl) {
         var1.add(var3.liiiIIllIl());
      }

      return var1;
   }

   public int lIiiIiIlilli() {
      long var4 = 6291488197710095715L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (IIIlilIllIIlilIl var3 : this.iiIiiillIl) {
         if (!var3.IliIlllilIi()) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public List<IIIlilIllIIlilIl> liiiIIllIl() {
      return this.iiIiiillIl;
   }

   public int IilliliilIIi() {
      return this.lIliiillIl;
   }

   public double IlIlllIlilIl() {
      return this.iIliiillIl <= 0.0 ? 0.0 : (double)this.lIiiIiIlilli() / this.iIliiillIl;
   }

   public int iliIiiliiiii() {
      long var4 = -7533539655898589870L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for (IIIlilIllIIlilIl var3 : this.iiIiiillIl) {
         if (var3.IliIlllilIi()) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public List<Long> iIlIlllllill() {
      return this.IIliiillIl;
   }

   public IllIllillllIllil IliIlllilIi() {
      return this.liIiiillIl;
   }
}
