package gg.corz;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.LongPredicate;

public final class iilliiilIIiliiil {
   private final long ilIIilIiil;
   private long IiIIilIiil;
   private final LinkedHashSet<Long> iiIIilIiil = new LinkedHashSet<>();
   private final LinkedHashSet<Long> IIlIilIiil = new LinkedHashSet<>();
   private liIliIiliiIliIil IllIilIiil = liIliIiliiIliIil.liiIIilIil;
   private IIIliilIIlii liIIilIiil;
   private boolean lllIilIiil;
   private final LongPredicate lIlIilIiil;
   private int iIlIilIiil;

   public boolean Illlllllilll(long cell) {
      return this.iiIIilIiil.remove(Long.valueOf(cell));
   }

   public boolean IiIlliIliiIl(long cell, boolean replaceableBeforePlacement, boolean isDirt) {
      return replaceableBeforePlacement && isDirt && !this.IIlIilIiil.contains(Long.valueOf(cell)) && !this.lIlIilIiil.test(cell)
         ? this.iiIIilIiil.add(Long.valueOf(cell))
         : false;
   }

   public void Ililllililil(liIliIiliiIliIil c) {
      this.IllIilIiil = c == null ? liIliIiliiIliIil.liiIIilIil : c;
   }

   public long IliIlllilIi() {
      return this.ilIIilIiil;
   }

   public boolean IIIilIIiiIIi() {
      return this.lllIilIiil;
   }

   public iilliiilIIiliiil(long id, long kind, IIIliilIIlii ownerTarget, int protectedCell, LongPredicate expectedUnlocks) {
      this.ilIIilIiil = id;
      this.IiIIilIiil = kind;
      this.liIIilIiil = ownerTarget;
      this.iIlIilIiil = Math.max(0, protectedCell);
      this.lIlIilIiil = expectedUnlocks;
   }

   public int lIiiIiIlilli() {
      return this.iIlIilIiil;
   }

   public liIliIiliiIliIil IIillIiliIil() {
      return this.IllIilIiil;
   }

   public boolean IIlllIlliIll(long cell) {
      return this.iiIIilIiil.contains(Long.valueOf(cell));
   }

   public iilliiilIIiliiil(long ownerTarget, long kind, IIIliilIIlii expectedUnlocks, int id) {
      this(ownerTarget, kind, expectedUnlocks, id, cell -> false);
   }

   public void iIlIlllllill(long newOwner, int unlocks) {
      this.IiIIilIiil = newOwner;
      this.iIlIilIiil = Math.max(this.iIlIilIiil, unlocks);
   }

   public iilliiilIIiliiil IlIlllIlilIl(long schematicCell) {
      this.IIlIilIiil.add(Long.valueOf(schematicCell));
      return this;
   }

   public double Iilllilliill() {
      return this.iiIIilIiil.isEmpty() ? (double)this.iIlIilIiil : (double)this.iIlIilIiil / (double)this.iiIIilIiil.size();
   }

   public IIIliilIIlii IilliliilIIi() {
      return this.liIIilIiil;
   }

   public Set<Long> iliIiiliiiii() {
      return Set.copyOf(this.iiIIilIiil);
   }

   public void IIIllIIliIIl(int unlocks) {
      this.liIIilIiil = IIIliilIIlii.lilIlilIliilIlilIl;
      this.iIlIilIiil = Math.max(this.iIlIilIiil, Math.max(0, unlocks));
   }

   public void Iiilliiliiil() {
      this.lllIilIiil = true;
      this.iIlIilIiil = 0;
   }

   public long liiiIIllIl() {
      return this.IiIIilIiil;
   }
}
