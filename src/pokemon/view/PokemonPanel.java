package pokemon.view;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import pokemon.controller.PokemonController;

public class PokemonPanel extends JPanel
{
	private PokemonController appController;
	private SpringLayout appLayout;
	
	private JLabel healthLabel;
	private JLabel attackLabel;
	private JLabel nameLabel;
	private JLabel numberLabel;
	private JLabel evolvableLabel;
	private JLabel modifierLabel;
	private JLabel iconLabel;
	
	private JCheckBox evolvableBox;
	private JTextField nameField;
	private JTextField numberField;
	private JTextField attackField;
	private JTextField healthField;
	private JTextField modifierField;
	
	private JTextArea descriptionArea;
	private JTextArea typeArea;
	
	private JButton saveButton;
	private JButton clearButton;
	private JComboBox pokedexDropdown;
	
	private JPanel firstType;
	private JPanel secondType;
	private JPanel thirdType;
	private JPanel fourthType;
	
	public PokemonPanel(PokemonController appController){
		super();
		
		this.appController = appController;
		
		appLayout = new SpringLayout();	
		healthLabel = new JLabel("Health");	
		attackLabel = new JLabel("Attack");
		nameLabel = new JLabel("Name");
		numberLabel = new JLabel("Number");
		evolvableLabel = new JLabel("Evolvable");
		modifierLabel = new JLabel("Modifier");
		iconLabel = new JLabel("Icon");
		evolvableBox = new JCheckBox();
		nameField = new JTextField();
		numberField = new JTextField();
		attackField = new JTextField();
		healthField = new JTextField();
		modifierField = new JTextField();
		
		descriptionArea = new JTextArea();
		typeArea = new JTextArea();
		
		saveButton = new JButton("Save");
		clearButton = new JButton("Clear");
		pokedexDropdown = new JComboBox();
		firstType = new JPanel();
		secondType = new JPanel();
		thirdType = new JPanel();
		fourthType = new JPanel();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel() {
		this.setLayout(appLayout);
		
		this.add(healthLabel);
		this.add(attackLabel);
		this.add(nameLabel);
		this.add(numberLabel);
		this.add(evolvableLabel);
		this.add(modifierLabel);
		this.add(iconLabel);
		
		this.add(evolvableBox);
		this.add(nameField);
		this.add(numberField);
		this.add(attackField);
		this.add(healthField);
		this.add(modifierField);
		
		this.add(descriptionArea);
		this.add(typeArea);
		
		this.add(saveButton);
		this.add(clearButton);
		this.add(pokedexDropdown);
		
		this.add(firstType);
		this.add(secondType);
		this.add(thirdType);
		this.add(fourthType);
	}
	private void setupLayout() {
		appLayout.putConstraint(SpringLayout.WEST, attackField, 158, SpringLayout.EAST, nameLabel);
		appLayout.putConstraint(SpringLayout.WEST, secondType, 0, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, secondType, 0, SpringLayout.SOUTH, firstType);
		appLayout.putConstraint(SpringLayout.WEST, thirdType, 0, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, fourthType, -108, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, firstType, 34, SpringLayout.SOUTH, fourthType);
		appLayout.putConstraint(SpringLayout.SOUTH, thirdType, 0, SpringLayout.SOUTH, fourthType);
		appLayout.putConstraint(SpringLayout.EAST, firstType, 0, SpringLayout.EAST, fourthType);
		appLayout.putConstraint(SpringLayout.WEST, fourthType, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.EAST, healthLabel, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, attackLabel, 0, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, nameLabel, 39, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, healthLabel, 0, SpringLayout.NORTH, nameLabel);
		appLayout.putConstraint(SpringLayout.NORTH, numberLabel, 28, SpringLayout.SOUTH, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, numberLabel, 0, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.WEST, evolvableLabel, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, evolvableLabel, 35, SpringLayout.SOUTH, modifierLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierLabel, 28, SpringLayout.SOUTH, attackLabel);
		appLayout.putConstraint(SpringLayout.WEST, modifierLabel, 0, SpringLayout.WEST, attackLabel);
		appLayout.putConstraint(SpringLayout.NORTH, iconLabel, 0, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.SOUTH, evolvableBox, 0, SpringLayout.SOUTH, evolvableLabel);
		appLayout.putConstraint(SpringLayout.EAST, evolvableBox, -6, SpringLayout.WEST, evolvableLabel);
		appLayout.putConstraint(SpringLayout.WEST, iconLabel, 0, SpringLayout.WEST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, nameField, 34, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, nameField, -430, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, nameLabel, 6, SpringLayout.EAST, nameField);
		appLayout.putConstraint(SpringLayout.NORTH, numberField, -5, SpringLayout.NORTH, numberLabel);
		appLayout.putConstraint(SpringLayout.EAST, numberField, -6, SpringLayout.WEST, numberLabel);
		appLayout.putConstraint(SpringLayout.WEST, attackLabel, 6, SpringLayout.EAST, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, attackField, -5, SpringLayout.NORTH, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, healthField, 34, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, healthField, -6, SpringLayout.WEST, healthLabel);
		appLayout.putConstraint(SpringLayout.NORTH, modifierField, 18, SpringLayout.SOUTH, attackField);
		appLayout.putConstraint(SpringLayout.WEST, modifierField, 0, SpringLayout.WEST, attackField);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 0, SpringLayout.NORTH, clearButton);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 6, SpringLayout.EAST, clearButton);
		appLayout.putConstraint(SpringLayout.SOUTH, clearButton, -10, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, pokedexDropdown, -11, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, clearButton, 6, SpringLayout.EAST, pokedexDropdown);
		appLayout.putConstraint(SpringLayout.EAST, pokedexDropdown, 0, SpringLayout.EAST, nameLabel);
	}
	private void setupListeners() {
		
	}
	
	private void updatePokedexInfo(int index) {
		nameField.setText(appController.getPokedex().get(index).getName());
		evolvableBox.setSelected(appController.getPokedex().get(index).isCanEvolve());
		numberField.setText(appController.getPokedex().get(index).getNumber() + "");
		attackField.setText(appController.getPokedex().get(index).getAttackPoints() + "");
		healthField.setText(appController.getPokedex().get(index).getHealthPoints() + "");
		modifierField.setText(appController.getPokedex().get(index).getEnhancementModifier() + "");
		
		descriptionArea.setText(appController.getPokedex().get(index).toString());
		
	}
	
	private void setupComboBox()
	{
		//DefaultComboBoxModel pokemonModel = new DefaultComboBoxModel(appController.convertPokedex());
		//pokedexDropdown.setModel(pokemonModel);
	}
	

}
