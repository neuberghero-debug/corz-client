package gg.corz;

import java.util.List;
import java.util.function.Predicate;
import net.minecraft.class_243;

public record lIiiiiiiIiiiii(
   long tick,
   IIllIIllIllIIl s,
   liiilIiliiiilIil target,
   lliiilIiiliiilIi self,
   iIliIlilIlliIlil tracker,
   IliIlIIllliIlIIl world,
   IiIIIlliIIIl cal,
   Iiiiilliiiil pearls,
   iiIllIliIIlllIli watch,
   iliilIlIiiilIl threat,
   List<liiilIiliiiilIil> enemies,
   IlliIlllllliIlll snap,
   Predicate<class_243> veto,
   lllliIilillliIil sprint,
   float selfBudget,
   iliIIiIiiIIi loadout,
   Iiliiililiii nav
) {
   private final iliilIlIiiilIl iliIilIlIl;
   private final IIllIIllIllIIl IilIilIlIl;
   private final lliiilIiiliiilIi iilIilIlIl;
   private final iiIllIliIIlllIli lliIilIlIl;
   private final liiilIiliiiilIil lilIilIlIl;
   private final Predicate<class_243> iiiIilIlIl;
   private final Iiiiilliiiil IliIilIlIl;
   private final List<liiilIiliiiilIil> IiiIilIlIl;
   private final iIliIlilIlliIlil IIiIilIlIl;
   private final Iiliiililiii IlIlilIlIl;
   private final lllliIilillliIil IIIlilIlIl;
   private final IiIIIlliIIIl iIiIilIlIl;
   private final IliIlIIllliIlIIl lIiIilIlIl;
   private final IlliIlllllliIlll liiIilIlIl;
   private final long illIilIlIl;
   private final iliIIiIiiIIi iIIlilIlIl;
   private final float lIIlilIlIl;

   public List<liiilIiliiiilIil> Illlllllilll() {
      return this.IiiIilIlIl;
   }

   public IiIIIlliIIIl IIIllIIliIIl() {
      return this.iIiIilIlIl;
   }

   public long IliIlllilIi() {
      return this.illIilIlIl;
   }

   public iIliIlilIlliIlil lIiiIiIlilli() {
      return this.IIiIilIlIl;
   }

   public IliIlIIllliIlIIl iliIiiliiiii() {
      return this.lIiIilIlIl;
   }

   public iliIIiIiiIIi IIIilIIiiIIi() {
      return this.iIIlilIlIl;
   }

   public iiIllIliIIlllIli IiIlliIliiIl() {
      return this.lliIilIlIl;
   }

   public Predicate<class_243> IIillIiliIil() {
      return this.iiiIilIlIl;
   }

   public lIiiiiiiIiiiii(
      long selfBudget,
      IIllIIllIllIIl sprint,
      liiilIiliiiilIil tick,
      lliiilIiiliiilIi cal,
      iIliIlilIlliIlil self,
      IliIlIIllliIlIIl pearls,
      IiIIIlliIIIl s,
      Iiiiilliiiil world,
      iiIllIliIIlllIli enemies,
      iliilIlIiiilIl veto,
      List<liiilIiliiiilIil> loadout,
      IlliIlllllliIlll target,
      Predicate<class_243> tracker,
      lllliIilillliIil snap,
      float watch,
      iliIIiIiiIIi threat
   ) {
      this(selfBudget, sprint, tick, cal, self, pearls, s, world, enemies, veto, loadout, target, tracker, snap, watch, threat, null);
   }

   public float Iiilliiliiil() {
      return this.lIIlilIlIl;
   }

   public Iiiiilliiiil IlIlllIlilIl() {
      return this.IliIilIlIl;
   }

   public IIllIIllIllIIl liiiIIllIl() {
      return this.IilIilIlIl;
   }

   public liiilIiliiiilIil iIlIlllllill() {
      return this.lilIilIlIl;
   }

   public iliilIlIiiilIl IIlllIlliIll() {
      return this.iliIilIlIl;
   }

   public lllliIilillliIil Ililllililil() {
      return this.IIIlilIlIl;
   }

   public Iiliiililiii IlIillIiilIi() {
      return this.IlIlilIlIl;
   }

   public lIiiiiiiIiiiii(
      long tick,
      IIllIIllIllIIl s,
      liiilIiliiiilIil target,
      lliiilIiiliiilIi self,
      iIliIlilIlliIlil tracker,
      IliIlIIllliIlIIl world,
      IiIIIlliIIIl cal,
      Iiiiilliiiil pearls,
      iiIllIliIIlllIli watch,
      iliilIlIiiilIl threat,
      List<liiilIiliiiilIil> enemies,
      IlliIlllllliIlll snap,
      Predicate<class_243> veto,
      lllliIilillliIil sprint,
      float selfBudget,
      iliIIiIiiIIi loadout,
      Iiliiililiii nav
   ) {
      this.illIilIlIl = tick;
      this.IilIilIlIl = s;
      this.lilIilIlIl = target;
      this.iilIilIlIl = self;
      this.IIiIilIlIl = tracker;
      this.lIiIilIlIl = world;
      this.iIiIilIlIl = cal;
      this.IliIilIlIl = pearls;
      this.lliIilIlIl = watch;
      this.iliIilIlIl = threat;
      this.IiiIilIlIl = enemies;
      this.liiIilIlIl = snap;
      this.iiiIilIlIl = veto;
      this.IIIlilIlIl = sprint;
      this.lIIlilIlIl = selfBudget;
      this.iIIlilIlIl = loadout;
      this.IlIlilIlIl = nav;
   }

   public IlliIlllllliIlll Iilllilliill() {
      return this.liiIilIlIl;
   }

   public lliiilIiiliiilIi IilliliilIIi() {
      return this.iilIilIlIl;
   }
}
