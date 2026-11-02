package gg.corz;

public final class llliiillilliiill {
   public boolean ilIliiiill;
   private final boolean liIliiiill;
   public boolean IlIliiiill;
   public boolean IiIliiiill;
   public boolean lIIliiiill;
   public boolean llIliiiill;
   public boolean iIIliiiill;

   public llliiillilliiill(boolean keybinds, boolean settings, boolean hud, boolean theme, boolean modules, boolean enabledStates) {
      this(keybinds, settings, hud, theme, modules, enabledStates, false);
   }

   static llliiillilliiill IilliliilIIi() {
      return new llliiillilliiill(true, true, true, true, true, true, true);
   }

   private llliiillilliiill(boolean enabledStates, boolean trusted, boolean settings, boolean modules, boolean hud, boolean theme, boolean keybinds) {
      this.lIIliiiill = enabledStates;
      this.iIIliiiill = trusted;
      this.IlIliiiill = settings;
      this.llIliiiill = modules;
      this.ilIliiiill = hud;
      this.IiIliiiill = theme;
      this.liIliiiill = keybinds;
   }

   public boolean IliIlllilIi() {
      return this.liIliiiill;
   }

   public static llliiillilliiill liiiIIllIl() {
      return new llliiillilliiill(true, true, true, true, false, false);
   }

   public static llliiillilliiill iIlIlllllill() {
      return new llliiillilliiill(true, true, true, true, true, true);
   }
}
